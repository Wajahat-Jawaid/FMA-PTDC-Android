package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListWhatToDoCategoryBindingImpl extends FragmentListWhatToDoCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"view_search_toolbar"},
            new int[] {7},
            new int[] {com.salampakistan.R.layout.view_search_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_no_trips, 6);
        sViewsWithIds.put(R.id.recycler_view, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListWhatToDoCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentListWhatToDoCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (com.salampakistan.databinding.ViewSearchToolbarBinding) bindings[7]
            , (android.view.View) bindings[6]
            );
        this.mainContent.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
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
            setFragment((com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment) variable);
        }
        else if (BR.categoryActivity == variableId) {
            setCategoryActivity((com.salampakistan.model.Activity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.whattodo.WhatToDoCategoryListFragment Fragment) {
        this.mFragment = Fragment;
    }
    public void setCategoryActivity(@Nullable com.salampakistan.model.Activity CategoryActivity) {
        this.mCategoryActivity = CategoryActivity;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.categoryActivity);
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
        java.lang.String mboundView5AndroidStringFeaturedTextCategoryActivityName = null;
        java.lang.String categoryActivityThumbnail = null;
        java.lang.String categoryActivityName = null;
        java.lang.String categoryActivityDescription = null;
        com.salampakistan.model.Activity categoryActivity = mCategoryActivity;

        if ((dirtyFlags & 0xcL) != 0) {



                if (categoryActivity != null) {
                    // read categoryActivity.thumbnail
                    categoryActivityThumbnail = categoryActivity.getThumbnail();
                    // read categoryActivity.name
                    categoryActivityName = categoryActivity.getName();
                    // read categoryActivity.description
                    categoryActivityDescription = categoryActivity.getDescription();
                }


                // read @android:string/featured_text
                mboundView5AndroidStringFeaturedTextCategoryActivityName = mboundView5.getResources().getString(R.string.featured_text, categoryActivityName);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setImageUrl(this.mboundView2, categoryActivityThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, categoryActivityDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringFeaturedTextCategoryActivityName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, categoryActivityName);
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
        flag 2 (0x3L): categoryActivity
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}