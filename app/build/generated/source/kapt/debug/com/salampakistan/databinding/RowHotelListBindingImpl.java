package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowHotelListBindingImpl extends RowHotelListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView12, 9);
        sViewsWithIds.put(R.id.image_container, 10);
        sViewsWithIds.put(R.id.ll_rating, 11);
        sViewsWithIds.put(R.id.price_per_day_text, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowHotelListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private RowHotelListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.RatingBar) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.priceText.setTag(null);
        this.ratingBar2.setTag(null);
        this.textView9.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.salampakistan.model.hotelsearchresponse.Hotel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.salampakistan.model.hotelsearchresponse.Hotel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.salampakistan.model.hotelsearchresponse.Hotel model = mModel;
        int modelHotelRatingRating = 0;
        com.salampakistan.model.hotelsearchresponse.HotelInfo modelHotelInfo = null;
        java.lang.String mboundView5AndroidStringRatingAverageModelHotelRatingRating = null;
        java.lang.String modelHotelInfoCancellationPolicyType = null;
        java.lang.String mboundView8AndroidStringFeeCancellationModelHotelInfoCancellationPolicyType = null;
        java.lang.String modelHotelInfoCurrencyCode = null;
        com.salampakistan.model.hotelsearchresponse.HotelRating modelHotelRating = null;
        java.lang.String modelHotelInfoName = null;
        java.lang.String modelHotelRateInfoPriceStartingFrom = null;
        java.lang.String modelHotelInfoImage = null;
        com.salampakistan.model.hotelsearchresponse.HotelRateInfo modelHotelRateInfo = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.hotelInfo
                    modelHotelInfo = model.getHotelInfo();
                    // read model.hotelRating
                    modelHotelRating = model.getHotelRating();
                    // read model.hotelRateInfo
                    modelHotelRateInfo = model.getHotelRateInfo();
                }


                if (modelHotelInfo != null) {
                    // read model.hotelInfo.cancellation_policy_type
                    modelHotelInfoCancellationPolicyType = modelHotelInfo.getCancellation_policy_type();
                    // read model.hotelInfo.currencyCode
                    modelHotelInfoCurrencyCode = modelHotelInfo.getCurrencyCode();
                    // read model.hotelInfo.name
                    modelHotelInfoName = modelHotelInfo.getName();
                    // read model.hotelInfo.image
                    modelHotelInfoImage = modelHotelInfo.getImage();
                }
                if (modelHotelRating != null) {
                    // read model.hotelRating.rating
                    modelHotelRatingRating = modelHotelRating.getRating();
                }
                if (modelHotelRateInfo != null) {
                    // read model.hotelRateInfo.priceStartingFrom
                    modelHotelRateInfoPriceStartingFrom = modelHotelRateInfo.getPriceStartingFrom();
                }


                // read @android:string/fee_cancellation
                mboundView8AndroidStringFeeCancellationModelHotelInfoCancellationPolicyType = mboundView8.getResources().getString(R.string.fee_cancellation, modelHotelInfoCancellationPolicyType);
                // read @android:string/rating_average
                mboundView5AndroidStringRatingAverageModelHotelRatingRating = mboundView5.getResources().getString(R.string.rating_average, modelHotelRatingRating);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setImageUrl(this.mboundView1, modelHotelInfoImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringRatingAverageModelHotelRatingRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, mboundView8AndroidStringFeeCancellationModelHotelInfoCancellationPolicyType);
            com.salampakistan.utils.BindingAdaptersKt.setPriceText(this.priceText, modelHotelRateInfoPriceStartingFrom, modelHotelInfoCurrencyCode);
            com.salampakistan.utils.BindingAdaptersKt.setRatingBarProgress(this.ratingBar2, modelHotelRatingRating);
            com.salampakistan.utils.BindingAdaptersKt.setCityState(this.textView9, model);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, modelHotelInfoName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mboundView6.getResources().getString(R.string.review_count, 0));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}