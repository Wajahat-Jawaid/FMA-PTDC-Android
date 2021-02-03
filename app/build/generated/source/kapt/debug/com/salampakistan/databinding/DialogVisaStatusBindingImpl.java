package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogVisaStatusBindingImpl extends DialogVisaStatusBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.arrival_visa_status_text, 4);
        sViewsWithIds.put(R.id.online_visa_status_text, 5);
        sViewsWithIds.put(R.id.ok_btn, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogVisaStatusBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogVisaStatusBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.countryText.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.arrival == variableId) {
            setArrival((java.lang.Boolean) variable);
        }
        else if (BR.country == variableId) {
            setCountry((java.lang.String) variable);
        }
        else if (BR.online == variableId) {
            setOnline((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArrival(@Nullable java.lang.Boolean Arrival) {
        this.mArrival = Arrival;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.arrival);
        super.requestRebind();
    }
    public void setCountry(@Nullable java.lang.String Country) {
        this.mCountry = Country;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.country);
        super.requestRebind();
    }
    public void setOnline(@Nullable java.lang.Boolean Online) {
        this.mOnline = Online;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.online);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxOnline = false;
        java.lang.Boolean arrival = mArrival;
        java.lang.String country = mCountry;
        boolean androidxDatabindingViewDataBindingSafeUnboxArrival = false;
        java.lang.Boolean online = mOnline;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(arrival)
                androidxDatabindingViewDataBindingSafeUnboxArrival = androidx.databinding.ViewDataBinding.safeUnbox(arrival);
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(online)
                androidxDatabindingViewDataBindingSafeUnboxOnline = androidx.databinding.ViewDataBinding.safeUnbox(online);
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryText, country);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxOnline);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxArrival);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): arrival
        flag 1 (0x2L): country
        flag 2 (0x3L): online
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}