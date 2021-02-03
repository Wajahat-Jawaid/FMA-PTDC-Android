package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UpdatePasswordFragmentBindingImpl extends UpdatePasswordFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_text, 1);
        sViewsWithIds.put(R.id.separator, 2);
        sViewsWithIds.put(R.id.old_pwd_layout, 3);
        sViewsWithIds.put(R.id.old_pwd_text, 4);
        sViewsWithIds.put(R.id.separator1, 5);
        sViewsWithIds.put(R.id.new_pwd_layout, 6);
        sViewsWithIds.put(R.id.new_pwd_text, 7);
        sViewsWithIds.put(R.id.separator2, 8);
        sViewsWithIds.put(R.id.confirm_pwd_layout, 9);
        sViewsWithIds.put(R.id.confirm_pwd_text, 10);
        sViewsWithIds.put(R.id.confirm_btn, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UpdatePasswordFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private UpdatePasswordFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[11]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.EditText) bindings[10]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.EditText) bindings[7]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setFragment((com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.profile.updatepassword.UpdatePasswordFragment Fragment) {
        this.mFragment = Fragment;
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
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}