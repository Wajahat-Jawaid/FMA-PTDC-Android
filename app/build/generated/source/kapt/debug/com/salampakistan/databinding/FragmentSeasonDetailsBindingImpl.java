package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSeasonDetailsBindingImpl extends FragmentSeasonDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(26);
        sIncludes.setIncludes(0, 
            new String[] {"view_search_toolbar"},
            new int[] {1},
            new int[] {com.salampakistan.R.layout.view_search_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.banner_img, 2);
        sViewsWithIds.put(R.id.title_text, 3);
        sViewsWithIds.put(R.id.short_desc_text, 4);
        sViewsWithIds.put(R.id.desc_text, 5);
        sViewsWithIds.put(R.id.img1, 6);
        sViewsWithIds.put(R.id.sights_title, 7);
        sViewsWithIds.put(R.id.sight_text1, 8);
        sViewsWithIds.put(R.id.sight_text2, 9);
        sViewsWithIds.put(R.id.img2, 10);
        sViewsWithIds.put(R.id.img3, 11);
        sViewsWithIds.put(R.id.img4, 12);
        sViewsWithIds.put(R.id.img5, 13);
        sViewsWithIds.put(R.id.seasonal_foods_text1, 14);
        sViewsWithIds.put(R.id.seasonal_foods_text2, 15);
        sViewsWithIds.put(R.id.seasonal_foods_img, 16);
        sViewsWithIds.put(R.id.travelling_title, 17);
        sViewsWithIds.put(R.id.travelling_text1, 18);
        sViewsWithIds.put(R.id.travelling_text2, 19);
        sViewsWithIds.put(R.id.travelling_img, 20);
        sViewsWithIds.put(R.id.festivities_title, 21);
        sViewsWithIds.put(R.id.festivities_text, 22);
        sViewsWithIds.put(R.id.festivities_layout, 23);
        sViewsWithIds.put(R.id.festivities_img_layout, 24);
        sViewsWithIds.put(R.id.festivities_img, 25);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSeasonDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentSeasonDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[25]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (com.salampakistan.databinding.ViewSearchToolbarBinding) bindings[1]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[17]
            );
        this.mainContent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            return variableSet;
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
        // batch finished
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}