package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFlightBookingBindingImpl extends FragmentFlightBookingBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(25);
        sIncludes.setIncludes(12, 
            new String[] {"view_counter_widget", "view_counter_widget", "view_counter_widget"},
            new int[] {14, 15, 16},
            new int[] {com.salampakistan.R.layout.view_counter_widget,
                com.salampakistan.R.layout.view_counter_widget,
                com.salampakistan.R.layout.view_counter_widget});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout3, 17);
        sViewsWithIds.put(R.id.constraintLayout, 18);
        sViewsWithIds.put(R.id.back_btn, 19);
        sViewsWithIds.put(R.id.title_text, 20);
        sViewsWithIds.put(R.id.cardView2, 21);
        sViewsWithIds.put(R.id.trip_type_rg, 22);
        sViewsWithIds.put(R.id.linearLayout12, 23);
        sViewsWithIds.put(R.id.linearLayout11, 24);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.RadioButton mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener locationArrivalTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.toLocation.getValue()
            //         is viewModel.toLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(locationArrivalText);
            // localize variables for thread safety
            // viewModel.toLocation != null
            boolean viewModelToLocationJavaLangObjectNull = false;
            // viewModel.toLocation.getValue()
            java.lang.String viewModelToLocationGetValue = null;
            // viewModel
            com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener locationDepartTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.fromLocation.getValue()
            //         is viewModel.fromLocation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(locationDepartText);
            // localize variables for thread safety
            // viewModel.fromLocation
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFromLocation = null;
            // viewModel
            com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel viewModel = mViewModel;
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

    public FragmentFlightBookingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentFlightBookingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (com.salampakistan.databinding.ViewCounterWidgetBinding) bindings[14]
            , (android.widget.ImageButton) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (com.salampakistan.databinding.ViewCounterWidgetBinding) bindings[15]
            , (android.widget.LinearLayout) bindings[18]
            , (com.salampakistan.databinding.ViewCounterWidgetBinding) bindings[16]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.Button) bindings[13]
            , (android.widget.TextView) bindings[20]
            , (android.widget.RadioGroup) bindings[22]
            );
        this.checkInText.setTag(null);
        this.checkOutText.setTag(null);
        this.linearLayout13.setTag(null);
        this.linearLayout6.setTag(null);
        this.locationArrivalText.setTag(null);
        this.locationDepartText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.RadioButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.oneWayRb.setTag(null);
        this.rvTopic.setTag(null);
        this.searchBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        mCallback55 = new com.salampakistan.generated.callback.OnClickListener(this, 10);
        mCallback50 = new com.salampakistan.generated.callback.OnClickListener(this, 5);
        mCallback48 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback56 = new com.salampakistan.generated.callback.OnClickListener(this, 11);
        mCallback51 = new com.salampakistan.generated.callback.OnClickListener(this, 6);
        mCallback49 = new com.salampakistan.generated.callback.OnClickListener(this, 4);
        mCallback52 = new com.salampakistan.generated.callback.OnClickListener(this, 7);
        mCallback46 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback54 = new com.salampakistan.generated.callback.OnClickListener(this, 9);
        mCallback53 = new com.salampakistan.generated.callback.OnClickListener(this, 8);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
        }
        adultsCounterLayout.invalidateAll();
        childrenCounterLayout.invalidateAll();
        infantsCounterLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (adultsCounterLayout.hasPendingBindings()) {
            return true;
        }
        if (childrenCounterLayout.hasPendingBindings()) {
            return true;
        }
        if (infantsCounterLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        adultsCounterLayout.setLifecycleOwner(lifecycleOwner);
        childrenCounterLayout.setLifecycleOwner(lifecycleOwner);
        infantsCounterLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTripType((androidx.lifecycle.MutableLiveData<com.salampakistan.model.enums.TripType>) object, fieldId);
            case 1 :
                return onChangeViewModelDepartingDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeAdultsCounterLayout((com.salampakistan.databinding.ViewCounterWidgetBinding) object, fieldId);
            case 3 :
                return onChangeInfantsCounterLayout((com.salampakistan.databinding.ViewCounterWidgetBinding) object, fieldId);
            case 4 :
                return onChangeChildrenCounterLayout((com.salampakistan.databinding.ViewCounterWidgetBinding) object, fieldId);
            case 5 :
                return onChangeViewModelValid((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelToLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelReturningDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelFromLocation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTripType(androidx.lifecycle.MutableLiveData<com.salampakistan.model.enums.TripType> ViewModelTripType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDepartingDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDepartingDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAdultsCounterLayout(com.salampakistan.databinding.ViewCounterWidgetBinding AdultsCounterLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInfantsCounterLayout(com.salampakistan.databinding.ViewCounterWidgetBinding InfantsCounterLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChildrenCounterLayout(com.salampakistan.databinding.ViewCounterWidgetBinding ChildrenCounterLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelValid(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelToLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelToLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReturningDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelReturningDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFromLocation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFromLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        com.salampakistan.model.enums.TripType viewModelTripTypeGetValue = null;
        com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
        androidx.lifecycle.MutableLiveData<com.salampakistan.model.enums.TripType> viewModelTripType = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDepartingDate = null;
        boolean viewModelTripTypeTripTypeROUNDTRIP = false;
        int viewModelValidSearchBtnAndroidColorThemeGreenSearchBtnAndroidColorGreenLight = 0;
        java.lang.String viewModelToLocationGetValue = null;
        java.lang.Boolean viewModelValidGetValue = null;
        java.lang.String viewModelReturningDateGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = false;
        java.lang.String viewModelDepartingDateGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelValid = null;
        java.lang.String viewModelFromLocationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelToLocation = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReturningDate = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFromLocation = null;
        com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xde3L) != 0) {


            if ((dirtyFlags & 0xc01L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tripType
                        viewModelTripType = viewModel.getTripType();
                    }
                    updateLiveDataRegistration(0, viewModelTripType);


                    if (viewModelTripType != null) {
                        // read viewModel.tripType.getValue()
                        viewModelTripTypeGetValue = viewModelTripType.getValue();
                    }


                    // read viewModel.tripType.getValue() == TripType.ROUND_TRIP
                    viewModelTripTypeTripTypeROUNDTRIP = (viewModelTripTypeGetValue) == (com.salampakistan.model.enums.TripType.ROUND_TRIP);
            }
            if ((dirtyFlags & 0xc02L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.departingDate
                        viewModelDepartingDate = viewModel.getDepartingDate();
                    }
                    updateLiveDataRegistration(1, viewModelDepartingDate);


                    if (viewModelDepartingDate != null) {
                        // read viewModel.departingDate.getValue()
                        viewModelDepartingDateGetValue = viewModelDepartingDate.getValue();
                    }
            }
            if ((dirtyFlags & 0xc20L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.valid
                        viewModelValid = viewModel.getValid();
                    }
                    updateLiveDataRegistration(5, viewModelValid);


                    if (viewModelValid != null) {
                        // read viewModel.valid.getValue()
                        viewModelValidGetValue = viewModelValid.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelValidGetValue);
                if((dirtyFlags & 0xc20L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
                    viewModelValidSearchBtnAndroidColorThemeGreenSearchBtnAndroidColorGreenLight = ((androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue) ? (getColorFromResource(searchBtn, R.color.theme_green)) : (getColorFromResource(searchBtn, R.color.green_light)));
            }
            if ((dirtyFlags & 0xc40L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toLocation
                        viewModelToLocation = viewModel.getToLocation();
                    }
                    updateLiveDataRegistration(6, viewModelToLocation);


                    if (viewModelToLocation != null) {
                        // read viewModel.toLocation.getValue()
                        viewModelToLocationGetValue = viewModelToLocation.getValue();
                    }
            }
            if ((dirtyFlags & 0xc80L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.returningDate
                        viewModelReturningDate = viewModel.getReturningDate();
                    }
                    updateLiveDataRegistration(7, viewModelReturningDate);


                    if (viewModelReturningDate != null) {
                        // read viewModel.returningDate.getValue()
                        viewModelReturningDateGetValue = viewModelReturningDate.getValue();
                    }
            }
            if ((dirtyFlags & 0xd00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fromLocation
                        viewModelFromLocation = viewModel.getFromLocation();
                    }
                    updateLiveDataRegistration(8, viewModelFromLocation);


                    if (viewModelFromLocation != null) {
                        // read viewModel.fromLocation.getValue()
                        viewModelFromLocationGetValue = viewModelFromLocation.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.adultsCounterLayout.setMarginTop(getRoot().getResources().getDimension(R.dimen.padding_large));
            this.adultsCounterLayout.setTitle(getRoot().getResources().getQuantityString(R.plurals.adults, 2));
            this.checkInText.setOnClickListener(mCallback55);
            this.checkOutText.setOnClickListener(mCallback54);
            this.childrenCounterLayout.setMarginTop(getRoot().getResources().getDimension(R.dimen.padding_tiny));
            this.childrenCounterLayout.setTitle(getRoot().getResources().getQuantityString(R.plurals.children, 2));
            this.infantsCounterLayout.setMarginTop(getRoot().getResources().getDimension(R.dimen.padding_tiny));
            this.infantsCounterLayout.setTitle(getRoot().getResources().getQuantityString(R.plurals.infants, 2));
            this.locationArrivalText.setOnClickListener(mCallback52);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationArrivalText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, locationArrivalTextandroidTextAttrChanged);
            this.locationDepartText.setOnClickListener(mCallback49);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationDepartText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, locationDepartTextandroidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback47);
            this.mboundView5.setOnClickListener(mCallback50);
            this.mboundView6.setOnClickListener(mCallback51);
            this.mboundView8.setOnClickListener(mCallback53);
            this.oneWayRb.setOnClickListener(mCallback46);
            this.rvTopic.setOnClickListener(mCallback48);
            this.searchBtn.setOnClickListener(mCallback56);
        }
        if ((dirtyFlags & 0xc80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkInText, viewModelReturningDateGetValue);
        }
        if ((dirtyFlags & 0xc02L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkOutText, viewModelDepartingDateGetValue);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.linearLayout6, viewModelTripTypeTripTypeROUNDTRIP);
        }
        if ((dirtyFlags & 0xc40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationArrivalText, viewModelToLocationGetValue);
        }
        if ((dirtyFlags & 0xd00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationDepartText, viewModelFromLocationGetValue);
        }
        if ((dirtyFlags & 0xc20L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.searchBtn.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelValidSearchBtnAndroidColorThemeGreenSearchBtnAndroidColorGreenLight));
            }
            // api target 1

            this.searchBtn.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelValidGetValue);
        }
        executeBindingsOn(adultsCounterLayout);
        executeBindingsOn(childrenCounterLayout);
        executeBindingsOn(infantsCounterLayout);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.switchTripType(com.salampakistan.model.enums.TripType.ROUND_TRIP);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onDateFieldClicked(com.salampakistan.model.enums.TripBound.RETURNING);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.FROM);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.FROM);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onDoneBtnClicked();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.TO);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.FROM);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.TO);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.salampakistan.ui.fragments.booking.flight.FlightBookingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.switchTripType(com.salampakistan.model.enums.TripType.ONE_WAY);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onDateFieldClicked(com.salampakistan.model.enums.TripBound.DEPARTING);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onLocationFieldClicked(com.salampakistan.model.enums.TripDirection.TO);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.tripType
        flag 1 (0x2L): viewModel.departingDate
        flag 2 (0x3L): adultsCounterLayout
        flag 3 (0x4L): infantsCounterLayout
        flag 4 (0x5L): childrenCounterLayout
        flag 5 (0x6L): viewModel.valid
        flag 6 (0x7L): viewModel.toLocation
        flag 7 (0x8L): viewModel.returningDate
        flag 8 (0x9L): viewModel.fromLocation
        flag 9 (0xaL): fragment
        flag 10 (0xbL): viewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.valid.getValue()) ? @android:color/theme_green : @android:color/green_light
    flag mapping end*/
    //end
}