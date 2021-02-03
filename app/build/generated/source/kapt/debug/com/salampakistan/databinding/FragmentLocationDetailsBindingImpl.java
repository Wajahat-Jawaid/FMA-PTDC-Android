package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLocationDetailsBindingImpl extends FragmentLocationDetailsBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(0, 
            new String[] {"view_search_toolbar"},
            new int[] {11},
            new int[] {com.salampakistan.R.layout.view_search_toolbar});
        sIncludes.setIncludes(1, 
            new String[] {"feedback"},
            new int[] {12},
            new int[] {com.salampakistan.R.layout.feedback});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll_view, 13);
        sViewsWithIds.put(R.id.images_frame_layout, 14);
        sViewsWithIds.put(R.id.poi_frame_layout, 15);
        sViewsWithIds.put(R.id.rel_loc_recycler_view, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLocationDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentLocationDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (com.salampakistan.databinding.FeedbackBinding) bindings[12]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.ScrollView) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (com.salampakistan.databinding.ViewSearchToolbarBinding) bindings[11]
            );
        this.addToPlanBtn.setTag(null);
        this.addToWishList.setTag(null);
        this.descText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.removeFromPlanBtn.setTag(null);
        this.removeFromWishList.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback15 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback16 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        mCallback18 = new com.salampakistan.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        toolbar.invalidateAll();
        feedbackView.invalidateAll();
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
        if (feedbackView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment) variable);
        }
        else if (BR.location == variableId) {
            setLocation((com.salampakistan.model.LocationDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setLocation(@Nullable com.salampakistan.model.LocationDetails Location) {
        this.mLocation = Location;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.location);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
        feedbackView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbar((com.salampakistan.databinding.ViewSearchToolbarBinding) object, fieldId);
            case 1 :
                return onChangeFeedbackView((com.salampakistan.databinding.FeedbackBinding) object, fieldId);
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
    private boolean onChangeFeedbackView(com.salampakistan.databinding.FeedbackBinding FeedbackView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment fragment = mFragment;
        com.salampakistan.model.LocationDetails location = mLocation;
        java.lang.String locationName = null;
        java.lang.String locationDescription = null;
        java.lang.String locationThumbnails0 = null;
        java.util.ArrayList<java.lang.String> locationThumbnails = null;
        java.lang.String locationLongDescription = null;
        java.lang.String mboundView10AndroidStringNewLocationNameLocationName = null;

        if ((dirtyFlags & 0x18L) != 0) {



                if (location != null) {
                    // read location.name
                    locationName = location.getName();
                    // read location.description
                    locationDescription = location.getDescription();
                    // read location.thumbnails
                    locationThumbnails = location.getThumbnails();
                    // read location.longDescription
                    locationLongDescription = location.getLongDescription();
                }


                // read @android:string/new_location_name
                mboundView10AndroidStringNewLocationNameLocationName = mboundView10.getResources().getString(R.string.new_location_name, locationName);
                if (locationThumbnails != null) {
                    // read location.thumbnails[0]
                    locationThumbnails0 = getFromList(locationThumbnails, 0);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.addToPlanBtn.setOnClickListener(mCallback15);
            this.addToWishList.setOnClickListener(mCallback18);
            this.removeFromPlanBtn.setOnClickListener(mCallback16);
            this.removeFromWishList.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descText, locationDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, mboundView10AndroidStringNewLocationNameLocationName);
            com.salampakistan.utils.BindingAdaptersKt.setImageUrl(this.mboundView2, locationThumbnails0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, locationLongDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, locationName);
        }
        executeBindingsOn(toolbar);
        executeBindingsOn(feedbackView);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.removeFromWishList();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addToPlan();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.removeFromPlan();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addToWishList();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): feedbackView
        flag 2 (0x3L): fragment
        flag 3 (0x4L): location
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}