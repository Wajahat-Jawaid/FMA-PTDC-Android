package com.salampakistan.utils

import android.content.Context
import android.content.pm.PackageManager
import android.util.Base64
import android.view.LayoutInflater
import androidx.core.app.ActivityCompat.requestPermissions
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.esafirm.imagepicker.features.ImagePicker
import com.esafirm.imagepicker.model.Image
import com.google.android.material.bottomsheet.BottomSheetDialog
import id.zelory.compressor.Compressor
import id.zelory.compressor.Compressor.compress
import id.zelory.compressor.constraint.quality
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import timber.log.Timber
import java.io.File
import java.nio.charset.StandardCharsets
import java.util.*
import kotlin.collections.ArrayList
import kotlin.coroutines.CoroutineContext

object ImageUtils {

    const val CompressSize = 150000

    suspend fun compressImage(
        images: Image,
        context: Context,
        coroutineContext: CoroutineContext
    ): ArrayList<File> {
        val compressedFiles = ArrayList<File>()

            Timber.d("before compress" + File(images.path).length())
            val file = compressWithQuality(context, coroutineContext, images)

            Timber.d("after compress" + file.length())
            compressedFiles.add(file)
        return compressedFiles
    }

    suspend fun compressWithQuality(
        context: Context,
        coroutineContext: CoroutineContext,
        item: Image
    ): File {
        val fileLength = File(item.path).length()
       return if(fileLength > CompressSize){
           val quality = (CompressSize.toDouble() / fileLength.toDouble()) * 100
           withContext(coroutineContext) {
               compress(
                   context!!,
                   File(item.path),
                   Dispatchers.Main
               ) { quality(quality.toInt()) }
           }
       }else {
           File(item.path)
       }
    }

    suspend fun getCompressImage(
        imgs: Image,
        context: Context,
        coroutineContext: CoroutineContext
    ): ArrayList<File> = compressImage(imgs, context!!, coroutineContext)

    fun convertFileToBase64(files: File): ArrayList<String> {
        val encodedList: ArrayList<String> = ArrayList()

            encodedList.add(Base64.encodeToString(files.readBytes(), Base64.DEFAULT))

        return encodedList
    }

    fun createMultipart(file: File): MultipartBody.Part {
        val filePart = RequestBody.create("multipart/form-data".toMediaTypeOrNull(), file)
        return MultipartBody.Part.createFormData(
            "attachments[]",
            file.name,
            filePart
        )
    }


}