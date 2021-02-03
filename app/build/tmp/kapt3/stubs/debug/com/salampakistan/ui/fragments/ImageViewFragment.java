package com.salampakistan.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\u001a\u0010\'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010!H\u0016J\b\u0010)\u001a\u00020\u001fH\u0002R\u001a\u0010\u0004\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/salampakistan/ui/fragments/ImageViewFragment;", "Lcom/salampakistan/base/BaseFragment;", "Lcom/salampakistan/databinding/FragmentImageViewBinding;", "()V", "binding", "getBinding", "()Lcom/salampakistan/databinding/FragmentImageViewBinding;", "setBinding", "(Lcom/salampakistan/databinding/FragmentImageViewBinding;)V", "imagePagerAdapter", "Lcom/salampakistan/ui/adapters/ImagePagerAdapter;", "getImagePagerAdapter", "()Lcom/salampakistan/ui/adapters/ImagePagerAdapter;", "setImagePagerAdapter", "(Lcom/salampakistan/ui/adapters/ImagePagerAdapter;)V", "images", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getImages", "()Ljava/util/ArrayList;", "setImages", "(Ljava/util/ArrayList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "getViewId", "handleArguments", "", "arguments", "Landroid/os/Bundle;", "injectBinding", "view", "Landroid/view/View;", "onResume", "onStop", "onViewCreated", "savedInstanceState", "setupImagePager", "Companion", "app_debug"})
public final class ImageViewFragment extends com.salampakistan.base.BaseFragment<com.salampakistan.databinding.FragmentImageViewBinding> {
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.ui.adapters.ImagePagerAdapter imagePagerAdapter;
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<java.lang.String> images;
    private int index;
    @org.jetbrains.annotations.NotNull()
    public com.salampakistan.databinding.FragmentImageViewBinding binding;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String IMAGES = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INDEX = null;
    public static final com.salampakistan.ui.fragments.ImageViewFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.ui.adapters.ImagePagerAdapter getImagePagerAdapter() {
        return null;
    }
    
    public final void setImagePagerAdapter(@org.jetbrains.annotations.NotNull()
    com.salampakistan.ui.adapters.ImagePagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.databinding.FragmentImageViewBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.salampakistan.databinding.FragmentImageViewBinding p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupImagePager() {
    }
    
    @java.lang.Override()
    public void handleArguments(@org.jetbrains.annotations.NotNull()
    android.os.Bundle arguments) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentImageViewBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public ImageViewFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/salampakistan/ui/fragments/ImageViewFragment$Companion;", "", "()V", "IMAGES", "", "getIMAGES", "()Ljava/lang/String;", "INDEX", "getINDEX", "TAG", "getInstance", "Lcom/salampakistan/ui/fragments/ImageViewFragment;", "images", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIMAGES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getINDEX() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.ImageViewFragment getInstance(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> images) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}