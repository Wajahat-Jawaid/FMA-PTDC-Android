package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListWhereToGoCategoryBindingImpl extends FragmentListWhereToGoCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"view_search_toolbar"},
            new int[] {7},
            new int[] {com.salampakistan.R.layout.view_search_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_no_trips, 6);
        sViewsWithIds.put(R.id.banner_layout, 8);
        sViewsWithIds.put(R.id.featured_recycler_view, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListWhereToGoCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentListWhereToGoCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (com.salampakistan.databinding.ViewSearchToolbarBinding) bindings[7]
            , (android.view.View) bindings[6]
            );
        this.featuredListTitle.setTag(null);
        this.mainContent.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment) variable);
        }
        else if (BR.categoryLocation == variableId) {
            setCategoryLocation((com.salampakistan.model.Location) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.wheretogo.WhereToGoCategoryListFragment Fragment) {
        this.mFragment = Fragment;
    }
    public void setCategoryLocation(@Nullable com.salampakistan.model.Location CategoryLocation) {
        this.mCategoryLocation = CategoryLocation;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.categoryLocation);
        super.requestRebind();
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
        java.lang.String categoryLocationDescription = null;
        java.lang.String categoryLocationThumbnail = null;
        com.salampakistan.model.Location categoryLocation = mCategoryLocation;
        java.lang.String categoryLocationName = null;
        java.lang.String featuredListTitleAndroidStringFeaturedTextCategoryLocationName = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (categoryLocation != null) {
                    // read categoryLocation.description
                    categoryLocationDescription = categoryLocation.getDescription();
                    // read categoryLocation.thumbnail
                    categoryLocationThumbnail = categoryLocation.getThumbnail();
                    // read categoryLocation.name
                    categoryLocationName = categoryLocation.getName();
                }


                // read @android:string/featured_text
                featuredListTitleAndroidStringFeaturedTextCategoryLocationName = featuredListTitle.getResources().getString(R.string.featured_text, categoryLocationName);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.featuredListTitle, featuredListTitleAndroidStringFeaturedTextCategoryLocationName);
            com.salampakistan.utils.BindingAdaptersKt.setImageUrl(this.mboundView2, categoryLocationThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, categoryLocationDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, categoryLocationName);
        }
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): fragment
        flag 2 (0x3L): categoryLocation
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}