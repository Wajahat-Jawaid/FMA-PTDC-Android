package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBusListBindingImpl extends FragmentBusListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout3, 1);
        sViewsWithIds.put(R.id.imageView6, 2);
        sViewsWithIds.put(R.id.constraintLayout3, 3);
        sViewsWithIds.put(R.id.linearLayout9, 4);
        sViewsWithIds.put(R.id.origin_shot_text, 5);
        sViewsWithIds.put(R.id.origin_long_text, 6);
        sViewsWithIds.put(R.id.view7, 7);
        sViewsWithIds.put(R.id.imageView5, 8);
        sViewsWithIds.put(R.id.date_text, 9);
        sViewsWithIds.put(R.id.linearLayout10, 10);
        sViewsWithIds.put(R.id.destination_shot_text, 11);
        sViewsWithIds.put(R.id.destination_long_text, 12);
        sViewsWithIds.put(R.id.constraintLayout, 13);
        sViewsWithIds.put(R.id.back_btn, 14);
        sViewsWithIds.put(R.id.view8, 15);
        sViewsWithIds.put(R.id.constraintLayout2, 16);
        sViewsWithIds.put(R.id.sort_text, 17);
        sViewsWithIds.put(R.id.view, 18);
        sViewsWithIds.put(R.id.textView2, 19);
        sViewsWithIds.put(R.id.bus_recycler_view, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBusListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentBusListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (android.widget.LinearLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[15]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}