package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewBackBtnBindingImpl extends ViewBackBtnBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewBackBtnBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ViewBackBtnBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[0]
            );
        this.backBtn.setTag(null);
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
        if (BR.blackTint == variableId) {
            setBlackTint((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBlackTint(@Nullable java.lang.Boolean BlackTint) {
        this.mBlackTint = BlackTint;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.blackTint);
        super.requestRebind();
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
        java.lang.Boolean blackTint = mBlackTint;
        int blackTintBackBtnAndroidColorBlackBackBtnAndroidColorWhite = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxBlackTint = false;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(blackTint)
                androidxDatabindingViewDataBindingSafeUnboxBlackTint = androidx.databinding.ViewDataBinding.safeUnbox(blackTint);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxBlackTint) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(blackTint) ? @android:color/black : @android:color/white
                blackTintBackBtnAndroidColorBlackBackBtnAndroidColorWhite = ((androidxDatabindingViewDataBindingSafeUnboxBlackTint) ? (getColorFromResource(backBtn, R.color.black)) : (getColorFromResource(backBtn, R.color.white)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.backBtn.setImageTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(blackTintBackBtnAndroidColorBlackBackBtnAndroidColorWhite));
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): blackTint
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(blackTint) ? @android:color/black : @android:color/white
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(blackTint) ? @android:color/black : @android:color/white
    flag mapping end*/
    //end
}