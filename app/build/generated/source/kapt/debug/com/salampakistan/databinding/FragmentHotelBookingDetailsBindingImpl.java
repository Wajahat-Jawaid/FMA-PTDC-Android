package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHotelBookingDetailsBindingImpl extends FragmentHotelBookingDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(1, 
            new String[] {"layout_amenities"},
            new int[] {2},
            new int[] {com.salampakistan.R.layout.layout_amenities});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout3, 3);
        sViewsWithIds.put(R.id.constraintLayout, 4);
        sViewsWithIds.put(R.id.back_btn, 5);
        sViewsWithIds.put(R.id.title_text, 6);
        sViewsWithIds.put(R.id.hotel_name_text, 7);
        sViewsWithIds.put(R.id.textView11, 8);
        sViewsWithIds.put(R.id.guideline2, 9);
        sViewsWithIds.put(R.id.linearLayout4, 10);
        sViewsWithIds.put(R.id.linearLayout6, 11);
        sViewsWithIds.put(R.id.linearLayout5, 12);
        sViewsWithIds.put(R.id.textView13, 13);
        sViewsWithIds.put(R.id.textView14, 14);
        sViewsWithIds.put(R.id.textView15, 15);
        sViewsWithIds.put(R.id.textView16, 16);
        sViewsWithIds.put(R.id.view5, 17);
        sViewsWithIds.put(R.id.textView17, 18);
        sViewsWithIds.put(R.id.button, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHotelBookingDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentHotelBookingDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.Button) bindings[19]
            , (android.widget.LinearLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (com.salampakistan.databinding.LayoutAmenitiesBinding) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[17]
            );
        this.constraintLayout2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
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
        incAmenities.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (incAmenities.hasPendingBindings()) {
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
        incAmenities.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncAmenities((com.salampakistan.databinding.LayoutAmenitiesBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncAmenities(com.salampakistan.databinding.LayoutAmenitiesBinding IncAmenities, int fieldId) {
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
        executeBindingsOn(incAmenities);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): incAmenities
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}