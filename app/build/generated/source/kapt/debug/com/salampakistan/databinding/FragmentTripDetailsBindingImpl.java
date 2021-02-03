package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTripDetailsBindingImpl extends FragmentTripDetailsBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(0, 
            new String[] {"view_search_toolbar"},
            new int[] {16},
            new int[] {com.salampakistan.R.layout.view_search_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll_view, 17);
        sViewsWithIds.put(R.id.image, 18);
        sViewsWithIds.put(R.id.images_frame_layout, 19);
        sViewsWithIds.put(R.id.itineraries_frame_layout, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTripDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentTripDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.flexbox.FlexboxLayout) bindings[8]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[20]
            , (com.google.android.flexbox.FlexboxLayout) bindings[10]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[17]
            , (com.google.android.flexbox.FlexboxLayout) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (com.salampakistan.databinding.ViewSearchToolbarBinding) bindings[16]
            );
        this.activitiesFlexBox.setTag(null);
        this.addToPlanBtn.setTag(null);
        this.addToWishList.setTag(null);
        this.descText.setTag(null);
        this.locationsFlexBox.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.removeFromPlanBtn.setTag(null);
        this.removeFromWishList.setTag(null);
        this.servicesFlexBox.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback33 = new com.salampakistan.generated.callback.OnClickListener(this, 4);
        mCallback30 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback32 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback31 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        toolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.cancellationPolicy == variableId) {
            setCancellationPolicy((java.lang.String) variable);
        }
        else if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment) variable);
        }
        else if (BR.event == variableId) {
            setEvent((com.salampakistan.model.Trip) variable);
        }
        else if (BR.imgUrl == variableId) {
            setImgUrl((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCancellationPolicy(@Nullable java.lang.String CancellationPolicy) {
        this.mCancellationPolicy = CancellationPolicy;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cancellationPolicy);
        super.requestRebind();
    }
    public void setFragment(@Nullable com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setEvent(@Nullable com.salampakistan.model.Trip Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.event);
        super.requestRebind();
    }
    public void setImgUrl(@Nullable java.lang.String ImgUrl) {
        this.mImgUrl = ImgUrl;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbar((com.salampakistan.databinding.ViewSearchToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbar(com.salampakistan.databinding.ViewSearchToolbarBinding Toolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String cancellationPolicy = mCancellationPolicy;
        com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment fragment = mFragment;
        java.lang.String eventDescription = null;
        int eventWhatsIncludedSize = 0;
        boolean eventWhatsIncludedSizeInt0 = false;
        boolean eventWhatsIncludedJavaLangObjectNullEventWhatsIncludedSizeInt0BooleanFalse = false;
        java.util.List<java.lang.String> eventLocations = null;
        boolean eventLocationsJavaLangObjectNull = false;
        java.util.List<com.salampakistan.model.TripWhatsIncluded> eventWhatsIncluded = null;
        com.salampakistan.model.Trip event = mEvent;
        boolean eventActivitiesJavaLangObjectNull = false;
        java.lang.String eventTitle = null;
        java.util.List<java.lang.String> eventActivities = null;
        boolean eventCancellationPolicyJavaLangObjectNull = false;
        boolean eventWhatsIncludedJavaLangObjectNull = false;
        java.lang.String eventCancellationPolicy = null;

        if ((dirtyFlags & 0x22L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {



                if (event != null) {
                    // read event.description
                    eventDescription = event.getDescription();
                    // read event.locations
                    eventLocations = event.getLocations();
                    // read event.whatsIncluded
                    eventWhatsIncluded = event.getWhatsIncluded();
                    // read event.title
                    eventTitle = event.getTitle();
                    // read event.activities
                    eventActivities = event.getActivities();
                    // read event.cancellationPolicy
                    eventCancellationPolicy = event.getCancellationPolicy();
                }


                // read event.locations != null
                eventLocationsJavaLangObjectNull = (eventLocations) != (null);
                // read event.whatsIncluded != null
                eventWhatsIncludedJavaLangObjectNull = (eventWhatsIncluded) != (null);
                // read event.activities != null
                eventActivitiesJavaLangObjectNull = (eventActivities) != (null);
                // read event.cancellationPolicy != null
                eventCancellationPolicyJavaLangObjectNull = (eventCancellationPolicy) != (null);
            if((dirtyFlags & 0x28L) != 0) {
                if(eventWhatsIncludedJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (eventWhatsIncluded != null) {
                    // read event.whatsIncluded.size()
                    eventWhatsIncludedSize = eventWhatsIncluded.size();
                }


                // read event.whatsIncluded.size() != 0
                eventWhatsIncludedSizeInt0 = (eventWhatsIncludedSize) != (0);
        }

        if ((dirtyFlags & 0x28L) != 0) {

                // read event.whatsIncluded != null ? event.whatsIncluded.size() != 0 : false
                eventWhatsIncludedJavaLangObjectNullEventWhatsIncludedSizeInt0BooleanFalse = ((eventWhatsIncludedJavaLangObjectNull) ? (eventWhatsIncludedSizeInt0) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.activitiesFlexBox, eventActivitiesJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descText, eventDescription);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.locationsFlexBox, eventLocationsJavaLangObjectNull);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView11, eventWhatsIncludedJavaLangObjectNullEventWhatsIncludedSizeInt0BooleanFalse);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView13, eventCancellationPolicyJavaLangObjectNull);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView14, eventCancellationPolicyJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, eventDescription);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView7, eventActivitiesJavaLangObjectNull);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView9, eventLocationsJavaLangObjectNull);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.servicesFlexBox, eventWhatsIncludedJavaLangObjectNullEventWhatsIncludedSizeInt0BooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, eventTitle);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.addToPlanBtn.setOnClickListener(mCallback30);
            this.addToWishList.setOnClickListener(mCallback33);
            this.removeFromPlanBtn.setOnClickListener(mCallback31);
            this.removeFromWishList.setOnClickListener(mCallback32);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, cancellationPolicy);
        }
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addToWishList();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addToPlan();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.removeFromWishList();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.tripdetails.TripDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.removeFromPlan();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): cancellationPolicy
        flag 2 (0x3L): fragment
        flag 3 (0x4L): event
        flag 4 (0x5L): imgUrl
        flag 5 (0x6L): null
        flag 6 (0x7L): event.whatsIncluded != null ? event.whatsIncluded.size() != 0 : false
        flag 7 (0x8L): event.whatsIncluded != null ? event.whatsIncluded.size() != 0 : false
    flag mapping end*/
    //end
}