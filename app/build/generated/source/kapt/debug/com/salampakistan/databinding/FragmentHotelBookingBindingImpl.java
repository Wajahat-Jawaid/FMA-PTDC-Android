package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHotelBookingBindingImpl extends FragmentHotelBookingBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"view_counter_widget", "view_counter_widget", "view_counter_widget"},
            new int[] {8, 9, 10},
            new int[] {com.salampakistan.R.layout.view_counter_widget,
                com.salampakistan.R.layout.view_counter_widget,
                com.salampakistan.R.layout.view_counter_widget});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout3, 11);
        sViewsWithIds.put(R.id.constraintLayout, 12);
        sViewsWithIds.put(R.id.back_btn, 13);
        sViewsWithIds.put(R.id.title_text, 14);
        sViewsWithIds.put(R.id.cardView2, 15);
        sViewsWithIds.put(R.id.linearLayout4, 16);
        sViewsWithIds.put(R.id.linearLayout6, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener locationTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.location.getValue()
            //         is viewModel.location.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(locationText);
            // localize variables for thread safety
            // viewModel.location != null
            boolean viewModelLocationJavaLangObjectNull = false;
            // viewModel
            com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel viewModel = mViewModel;
            // viewModel.location.getValue()
            java.lang.String viewModelLocationGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.location
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLocation = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLocation = viewModel.getLocation();

                viewModelLocationJavaLangObjectNull = (viewModelLocation) != (null);
                if (viewModelLocationJavaLangObjectNull) {




                    viewModelLocation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentHotelBookingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentHotelBookingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.salampakistan.databinding.ViewCounterWidgetBinding) bindings[9]
            , (android.widget.ImageButton) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (com.salampakistan.databinding.ViewCounterWidgetBinding) bindings[10]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[3]
            , (com.salampakistan.databinding.ViewCounterWidgetBinding) bindings[8]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[14]
            );
        this.checkInText.setTag(null);
        this.checkOutText.setTag(null);
        this.locationText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.rvTopic.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.salampakistan.generated.callback.OnClickListener(this, 5);
        mCallback23 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback21 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback26 = new com.salampakistan.generated.callback.OnClickListener(this, 6);
        mCallback24 = new com.salampakistan.generated.callback.OnClickListener(this, 4);
        mCallback22 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        roomsCounterLayout.invalidateAll();
        adultsCounterLayout.invalidateAll();
        childrenCounterLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (roomsCounterLayout.hasPendingBindings()) {
            return true;
        }
        if (adultsCounterLayout.hasPendingBindings()) {
            return true;
        }
        if (childrenCounterLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        roomsCounterLayout.setLifecycleOwner(lifecycleOwner);
        adultsCounterLayout.setLifecycleOwner(lifecycleOwner);
        childrenCounterLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAdultsCounterLayout((com.salampakistan.databinding.ViewCounterWidgetBinding) object, fieldId);
            case 1 :
                return onChangeViewModelValid((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelCheckInDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeChildrenCounterLayout((com.salampakistan.databinding.ViewCounterWidgetBinding) object, fieldId);
            case 4 :
                return onChangeRoomsCounterLayout((com.salampakistan.databinding.ViewCounterWidgetBinding) object, fieldId);
            case 5 :
                return onChangeViewModelCheckOutDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAdultsCounterLayout(com.salampakistan.databinding.ViewCounterWidgetBinding AdultsCounterLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelValid(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCheckInDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelCheckInDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChildrenCounterLayout(com.salampakistan.databinding.ViewCounterWidgetBinding ChildrenCounterLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRoomsCounterLayout(com.salampakistan.databinding.ViewCounterWidgetBinding RoomsCounterLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCheckOutDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelCheckOutDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
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
        com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
        java.lang.String viewModelCheckInDateGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = false;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelValid = null;
        int viewModelValidMboundView7AndroidColorThemeGreenMboundView7AndroidColorGreenLight = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCheckInDate = null;
        java.lang.String viewModelCheckOutDateGetValue = null;
        java.lang.Boolean viewModelValidGetValue = null;
        com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCheckOutDate = null;
        java.lang.String viewModelLocationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLocation = null;

        if ((dirtyFlags & 0x366L) != 0) {


            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.valid
                        viewModelValid = viewModel.getValid();
                    }
                    updateLiveDataRegistration(1, viewModelValid);


                    if (viewModelValid != null) {
                        // read viewModel.valid.getValue()
                        viewModelValidGetValue = viewModelValid.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelValidGetValue);
                if((dirtyFlags & 0x302L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
                    viewModelValidMboundView7AndroidColorThemeGreenMboundView7AndroidColorGreenLight = ((androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) ? (getColorFromResource(mboundView7, R.color.theme_green)) : (getColorFromResource(mboundView7, R.color.green_light)));
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.checkInDate
                        viewModelCheckInDate = viewModel.getCheckInDate();
                    }
                    updateLiveDataRegistration(2, viewModelCheckInDate);


                    if (viewModelCheckInDate != null) {
                        // read viewModel.checkInDate.getValue()
                        viewModelCheckInDateGetValue = viewModelCheckInDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.checkOutDate
                        viewModelCheckOutDate = viewModel.getCheckOutDate();
                    }
                    updateLiveDataRegistration(5, viewModelCheckOutDate);


                    if (viewModelCheckOutDate != null) {
                        // read viewModel.checkOutDate.getValue()
                        viewModelCheckOutDateGetValue = viewModelCheckOutDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.location
                        viewModelLocation = viewModel.getLocation();
                    }
                    updateLiveDataRegistration(6, viewModelLocation);


                    if (viewModelLocation != null) {
                        // read viewModel.location.getValue()
                        viewModelLocationGetValue = viewModelLocation.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.checkInText.setOnClickListener(mCallback24);
            this.checkOutText.setOnClickListener(mCallback25);
            this.locationText.setOnClickListener(mCallback22);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, locationTextandroidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback23);
            this.mboundView7.setOnClickListener(mCallback26);
            this.rvTopic.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkInText, viewModelCheckInDateGetValue);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkOutText, viewModelCheckOutDateGetValue);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationText, viewModelLocationGetValue);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView7.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelValidMboundView7AndroidColorThemeGreenMboundView7AndroidColorGreenLight));
            }
            // api target 1

            this.mboundView7.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue);
        }
        executeBindingsOn(roomsCounterLayout);
        executeBindingsOn(adultsCounterLayout);
        executeBindingsOn(childrenCounterLayout);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onDateFieldClicked(com.salampakistan.model.enums.HotelCheck.CHECK_OUT);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationFieldClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationFieldClicked();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onDoneBtnClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onDateFieldClicked(com.salampakistan.model.enums.HotelCheck.CHECK_IN);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationFieldClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adultsCounterLayout
        flag 1 (0x2L): viewModel.valid
        flag 2 (0x3L): viewModel.checkInDate
        flag 3 (0x4L): childrenCounterLayout
        flag 4 (0x5L): roomsCounterLayout
        flag 5 (0x6L): viewModel.checkOutDate
        flag 6 (0x7L): viewModel.location
        flag 7 (0x8L): fragment
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
    flag mapping end*/
    //end
}