package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTrainBookingBindingImpl extends FragmentTrainBookingBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.from_label, 6);
        sViewsWithIds.put(R.id.from_separator, 7);
        sViewsWithIds.put(R.id.to_label, 8);
        sViewsWithIds.put(R.id.guideline, 9);
        sViewsWithIds.put(R.id.trip_type_rg, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.RadioButton mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener fromTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.fromLocation.getValue()
            //         is viewModel.fromLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fromText);
            // localize variables for thread safety
            // viewModel.fromLocation
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFromLocation = null;
            // viewModel
            com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel = mViewModel;
            // viewModel.fromLocation.getValue()
            java.lang.String viewModelFromLocationGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.fromLocation != null
            boolean viewModelFromLocationJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFromLocation = viewModel.getFromLocation();

                viewModelFromLocationJavaLangObjectNull = (viewModelFromLocation) != (null);
                if (viewModelFromLocationJavaLangObjectNull) {




                    viewModelFromLocation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener toTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.toLocation.getValue()
            //         is viewModel.toLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(toText);
            // localize variables for thread safety
            // viewModel.toLocation != null
            boolean viewModelToLocationJavaLangObjectNull = false;
            // viewModel.toLocation.getValue()
            java.lang.String viewModelToLocationGetValue = null;
            // viewModel
            com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.toLocation
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelToLocation = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelToLocation = viewModel.getToLocation();

                viewModelToLocationJavaLangObjectNull = (viewModelToLocation) != (null);
                if (viewModelToLocationJavaLangObjectNull) {




                    viewModelToLocation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentTrainBookingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentTrainBookingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RadioGroup) bindings[10]
            );
        this.fromText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.RadioButton) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.oneWayRb.setTag(null);
        this.toText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.salampakistan.generated.callback.OnClickListener(this, 4);
        mCallback6 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        mCallback9 = new com.salampakistan.generated.callback.OnClickListener(this, 5);
        mCallback7 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback5 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setFragment((com.salampakistan.ui.fragments.booking.train.TrainBookingFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.booking.train.TrainBookingFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
                return onChangeViewModelToLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelFromLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelToLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelToLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFromLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFromLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.salampakistan.ui.fragments.booking.train.TrainBookingFragment fragment = mFragment;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = false;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelValid = null;
        java.lang.String viewModelFromLocationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelToLocation = null;
        int viewModelValidMboundView5AndroidColorThemeGreenMboundView5AndroidColorGreenLight = 0;
        java.lang.String viewModelToLocationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFromLocation = null;
        java.lang.Boolean viewModelValidGetValue = null;
        com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

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
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
                    viewModelValidMboundView5AndroidColorThemeGreenMboundView5AndroidColorGreenLight = ((androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) ? (getColorFromResource(mboundView5, R.color.theme_green)) : (getColorFromResource(mboundView5, R.color.green_light)));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toLocation
                        viewModelToLocation = viewModel.getToLocation();
                    }
                    updateLiveDataRegistration(1, viewModelToLocation);


                    if (viewModelToLocation != null) {
                        // read viewModel.toLocation.getValue()
                        viewModelToLocationGetValue = viewModelToLocation.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fromLocation
                        viewModelFromLocation = viewModel.getFromLocation();
                    }
                    updateLiveDataRegistration(2, viewModelFromLocation);


                    if (viewModelFromLocation != null) {
                        // read viewModel.fromLocation.getValue()
                        viewModelFromLocationGetValue = viewModelFromLocation.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.fromText.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fromText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fromTextandroidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback8);
            this.mboundView5.setOnClickListener(mCallback9);
            this.oneWayRb.setOnClickListener(mCallback7);
            this.toText.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.toText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, toTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fromText, viewModelFromLocationGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView5, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelValidMboundView5AndroidColorThemeGreenMboundView5AndroidColorGreenLight));
            this.mboundView5.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toText, viewModelToLocationGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.switchTripType(com.salampakistan.model.enums.TripType.ROUND_TRIP);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.train.TrainBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.TO);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.train.TrainBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onDoneBtnClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.salampakistan.ui.fragments.booking.train.TrainBookingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.switchTripType(com.salampakistan.model.enums.TripType.ONE_WAY);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.train.TrainBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.FROM);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.valid
        flag 1 (0x2L): viewModel.toLocation
        flag 2 (0x3L): viewModel.fromLocation
        flag 3 (0x4L): fragment
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
    flag mapping end*/
    //end
}