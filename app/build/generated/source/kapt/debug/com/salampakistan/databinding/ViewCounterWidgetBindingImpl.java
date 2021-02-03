package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewCounterWidgetBindingImpl extends ViewCounterWidgetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.decrease_counter_btn, 1);
        sViewsWithIds.put(R.id.counter_value_text, 2);
        sViewsWithIds.put(R.id.increase_counter_btn, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewCounterWidgetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ViewCounterWidgetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.llCounter.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        else if (BR.marginEnd == variableId) {
            setMarginEnd((java.lang.Float) variable);
        }
        else if (BR.marginTop == variableId) {
            setMarginTop((java.lang.Float) variable);
        }
        else if (BR.marginStart == variableId) {
            setMarginStart((java.lang.Float) variable);
        }
        else if (BR.marginBottom == variableId) {
            setMarginBottom((java.lang.Float) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
    }
    public void setMarginEnd(@Nullable java.lang.Float MarginEnd) {
        this.mMarginEnd = MarginEnd;
    }
    public void setMarginTop(@Nullable java.lang.Float MarginTop) {
        this.mMarginTop = MarginTop;
    }
    public void setMarginStart(@Nullable java.lang.Float MarginStart) {
        this.mMarginStart = MarginStart;
    }
    public void setMarginBottom(@Nullable java.lang.Float MarginBottom) {
        this.mMarginBottom = MarginBottom;
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
        flag 0 (0x1L): title
        flag 1 (0x2L): marginEnd
        flag 2 (0x3L): marginTop
        flag 3 (0x4L): marginStart
        flag 4 (0x5L): marginBottom
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}