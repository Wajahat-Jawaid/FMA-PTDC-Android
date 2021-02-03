package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewProfileOptionBindingImpl extends ViewProfileOptionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewProfileOptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ViewProfileOptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.optionText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.icon == variableId) {
            setIcon((android.graphics.drawable.Drawable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setIcon(@Nullable android.graphics.drawable.Drawable Icon) {
        this.mIcon = Icon;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.icon);
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
        java.lang.String title = mTitle;
        boolean titleOptionTextAndroidStringLogout = false;
        android.graphics.drawable.Drawable icon = mIcon;
        android.graphics.drawable.Drawable titleOptionTextAndroidStringLogoutOptionTextAndroidDrawableIcChevronRightGrey24dpOptionTextAndroidDrawableEmpty = null;

        if ((dirtyFlags & 0x5L) != 0) {



                // read title != @android:string/logout
                titleOptionTextAndroidStringLogout = (title) != (optionText.getResources().getString(R.string.logout));
            if((dirtyFlags & 0x5L) != 0) {
                if(titleOptionTextAndroidStringLogout) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read title != @android:string/logout ? @android:drawable/ic_chevron_right_grey24dp : @android:drawable/empty
                titleOptionTextAndroidStringLogoutOptionTextAndroidDrawableIcChevronRightGrey24dpOptionTextAndroidDrawableEmpty = ((titleOptionTextAndroidStringLogout) ? (getDrawableFromResource(optionText, R.drawable.ic_chevron_right_grey24dp)) : (getDrawableFromResource(optionText, R.drawable.empty)));
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableStart(this.optionText, icon);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.optionText, titleOptionTextAndroidStringLogoutOptionTextAndroidDrawableIcChevronRightGrey24dpOptionTextAndroidDrawableEmpty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.optionText, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): icon
        flag 2 (0x3L): null
        flag 3 (0x4L): title != @android:string/logout ? @android:drawable/ic_chevron_right_grey24dp : @android:drawable/empty
        flag 4 (0x5L): title != @android:string/logout ? @android:drawable/ic_chevron_right_grey24dp : @android:drawable/empty
    flag mapping end*/
    //end
}