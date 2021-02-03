package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWeatherBindingImpl extends FragmentWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.city_text, 2);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.RelativeLayout) bindings[0]
            );
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.weatherLayout.setTag(null);
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
        if (BR.temperature == variableId) {
            setTemperature((java.lang.Float) variable);
        }
        else if (BR.location == variableId) {
            setLocation((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTemperature(@Nullable java.lang.Float Temperature) {
        this.mTemperature = Temperature;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.temperature);
        super.requestRebind();
    }
    public void setLocation(@Nullable java.lang.String Location) {
        this.mLocation = Location;
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
        java.lang.Float temperature = mTemperature;
        float androidxDatabindingViewDataBindingSafeUnboxTemperature = 0f;
        android.text.SpannableString primitiveExtensionKtGetCelsiusTemperatureTemperature = null;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(temperature)
                androidxDatabindingViewDataBindingSafeUnboxTemperature = androidx.databinding.ViewDataBinding.safeUnbox(temperature);


                // read PrimitiveExtensionKt.getCelsiusTemperature(androidx.databinding.ViewDataBinding.safeUnbox(temperature))
                primitiveExtensionKtGetCelsiusTemperatureTemperature = com.salampakistan.utils.extension.PrimitiveExtensionKt.getCelsiusTemperature(androidxDatabindingViewDataBindingSafeUnboxTemperature);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, primitiveExtensionKtGetCelsiusTemperatureTemperature);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setDrawableTint(this.mboundView1, com.salampakistan.utils.TintDrawableAlignment.RIGHT, getColorFromResource(mboundView1, R.color.white));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): temperature
        flag 1 (0x2L): location
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}