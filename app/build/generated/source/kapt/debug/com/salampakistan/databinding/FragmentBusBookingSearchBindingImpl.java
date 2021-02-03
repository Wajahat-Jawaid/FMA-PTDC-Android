package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBusBookingSearchBindingImpl extends FragmentBusBookingSearchBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout3, 12);
        sViewsWithIds.put(R.id.constraintLayout, 13);
        sViewsWithIds.put(R.id.back_btn, 14);
        sViewsWithIds.put(R.id.title_text, 15);
        sViewsWithIds.put(R.id.cardView2, 16);
        sViewsWithIds.put(R.id.linearLayout4, 17);
        sViewsWithIds.put(R.id.linearLayout6, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.Button mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener locationArrivalTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.arrivalLocation.getValue()
            //         is viewModel.arrivalLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(locationArrivalText);
            // localize variables for thread safety
            // viewModel.arrivalLocation.getValue()
            java.lang.String viewModelArrivalLocationGetValue = null;
            // viewModel.arrivalLocation
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelArrivalLocation = null;
            // viewModel
            com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.arrivalLocation != null
            boolean viewModelArrivalLocationJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelArrivalLocation = viewModel.getArrivalLocation();

                viewModelArrivalLocationJavaLangObjectNull = (viewModelArrivalLocation) != (null);
                if (viewModelArrivalLocationJavaLangObjectNull) {




                    viewModelArrivalLocation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener locationDepartTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.departLocation.getValue()
            //         is viewModel.departLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(locationDepartText);
            // localize variables for thread safety
            // viewModel.departLocation.getValue()
            java.lang.String viewModelDepartLocationGetValue = null;
            // viewModel.departLocation != null
            boolean viewModelDepartLocationJavaLangObjectNull = false;
            // viewModel
            com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.departLocation
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDepartLocation = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDepartLocation = viewModel.getDepartLocation();

                viewModelDepartLocationJavaLangObjectNull = (viewModelDepartLocation) != (null);
                if (viewModelDepartLocationJavaLangObjectNull) {




                    viewModelDepartLocation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener locationTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.services.getValue()
            //         is viewModel.services.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(locationText);
            // localize variables for thread safety
            // viewModel.services != null
            boolean viewModelServicesJavaLangObjectNull = false;
            // viewModel.services.getValue()
            java.lang.String viewModelServicesGetValue = null;
            // viewModel
            com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel viewModel = mViewModel;
            // viewModel.services
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelServices = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelServices = viewModel.getServices();

                viewModelServicesJavaLangObjectNull = (viewModelServices) != (null);
                if (viewModelServicesJavaLangObjectNull) {




                    viewModelServices.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentBusBookingSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentBusBookingSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageButton) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[15]
            );
        this.dateText.setTag(null);
        this.locationArrivalText.setTag(null);
        this.locationDepartText.setTag(null);
        this.locationText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.widget.Button) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.rvTopic.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new com.salampakistan.generated.callback.OnClickListener(this, 5);
        mCallback37 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback45 = new com.salampakistan.generated.callback.OnClickListener(this, 11);
        mCallback35 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback43 = new com.salampakistan.generated.callback.OnClickListener(this, 9);
        mCallback42 = new com.salampakistan.generated.callback.OnClickListener(this, 8);
        mCallback40 = new com.salampakistan.generated.callback.OnClickListener(this, 6);
        mCallback38 = new com.salampakistan.generated.callback.OnClickListener(this, 4);
        mCallback36 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        mCallback44 = new com.salampakistan.generated.callback.OnClickListener(this, 10);
        mCallback41 = new com.salampakistan.generated.callback.OnClickListener(this, 7);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelValid((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelDepartLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelArrivalLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelServices((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelValid(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDepartLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDepartLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelArrivalLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelArrivalLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelServices(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelServices, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
        java.lang.String viewModelServicesGetValue = null;
        java.lang.String viewModelDepartLocationGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = false;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelValid = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDepartLocation = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDate = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelArrivalLocation = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelServices = null;
        int viewModelValidMboundView11AndroidColorThemeGreenMboundView11AndroidColorGreenLight = 0;
        java.lang.String viewModelArrivalLocationGetValue = null;
        java.lang.Boolean viewModelValidGetValue = null;
        com.salampakistan.ui.fragments.booking.bus.BusBookingSearchViewModel viewModel = mViewModel;
        java.lang.String viewModelDateGetValue = null;

        if ((dirtyFlags & 0xdfL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.valid
                        viewModelValid = viewModel.getValid();
                    }
                    updateLiveDataRegistration(0, viewModelValid);


                    if (viewModelValid != null) {
                        // read viewModel.valid.getValue()
                        viewModelValidGetValue = viewModelValid.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelValidGetValue);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
                    viewModelValidMboundView11AndroidColorThemeGreenMboundView11AndroidColorGreenLight = ((androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) ? (getColorFromResource(mboundView11, R.color.theme_green)) : (getColorFromResource(mboundView11, R.color.green_light)));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.departLocation
                        viewModelDepartLocation = viewModel.getDepartLocation();
                    }
                    updateLiveDataRegistration(1, viewModelDepartLocation);


                    if (viewModelDepartLocation != null) {
                        // read viewModel.departLocation.getValue()
                        viewModelDepartLocationGetValue = viewModelDepartLocation.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.date
                        viewModelDate = viewModel.getDate();
                    }
                    updateLiveDataRegistration(2, viewModelDate);


                    if (viewModelDate != null) {
                        // read viewModel.date.getValue()
                        viewModelDateGetValue = viewModelDate.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.arrivalLocation
                        viewModelArrivalLocation = viewModel.getArrivalLocation();
                    }
                    updateLiveDataRegistration(3, viewModelArrivalLocation);


                    if (viewModelArrivalLocation != null) {
                        // read viewModel.arrivalLocation.getValue()
                        viewModelArrivalLocationGetValue = viewModelArrivalLocation.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.services
                        viewModelServices = viewModel.getServices();
                    }
                    updateLiveDataRegistration(4, viewModelServices);


                    if (viewModelServices != null) {
                        // read viewModel.services.getValue()
                        viewModelServicesGetValue = viewModelServices.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.dateText.setOnClickListener(mCallback44);
            this.locationArrivalText.setOnClickListener(mCallback42);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationArrivalText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, locationArrivalTextandroidTextAttrChanged);
            this.locationDepartText.setOnClickListener(mCallback39);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationDepartText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, locationDepartTextandroidTextAttrChanged);
            this.locationText.setOnClickListener(mCallback36);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, locationTextandroidTextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback35);
            this.mboundView11.setOnClickListener(mCallback45);
            this.mboundView3.setOnClickListener(mCallback37);
            this.mboundView6.setOnClickListener(mCallback40);
            this.mboundView7.setOnClickListener(mCallback41);
            this.mboundView9.setOnClickListener(mCallback43);
            this.rvTopic.setOnClickListener(mCallback38);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateText, viewModelDateGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationArrivalText, viewModelArrivalLocationGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationDepartText, viewModelDepartLocationGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationText, viewModelServicesGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView11.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelValidMboundView11AndroidColorThemeGreenMboundView11AndroidColorGreenLight));
            }
            // api target 1

            this.mboundView11.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationDepartureFieldClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onServicesFieldClicked();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onDoneBtnClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onServicesFieldClicked();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationArrivalFieldClicked();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationArrivalFieldClicked();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationDepartureFieldClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationDepartureFieldClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onServicesFieldClicked();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onDateFieldClicked();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.bus.BusBookingSearchFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLocationArrivalFieldClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.valid
        flag 1 (0x2L): viewModel.departLocation
        flag 2 (0x3L): viewModel.date
        flag 3 (0x4L): viewModel.arrivalLocation
        flag 4 (0x5L): viewModel.services
        flag 5 (0x6L): fragment
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
    flag mapping end*/
    //end
}