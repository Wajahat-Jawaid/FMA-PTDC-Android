package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowBusBindingImpl extends RowBusBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container_Vew, 3);
        sViewsWithIds.put(R.id.constraintLayout7, 4);
        sViewsWithIds.put(R.id.linearLayout9, 5);
        sViewsWithIds.put(R.id.view14, 6);
        sViewsWithIds.put(R.id.relativeLayout, 7);
        sViewsWithIds.put(R.id.rec_services, 8);
        sViewsWithIds.put(R.id.bottom_logo_text, 9);
        sViewsWithIds.put(R.id.relativeLayout4, 10);
        sViewsWithIds.put(R.id.book_now_btn, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowBusBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private RowBusBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[11]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.salampakistan.model.getbusservicesreponse.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.salampakistan.model.getbusservicesreponse.Data Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        com.salampakistan.model.getbusservicesreponse.Data model = mModel;
        java.lang.String modelOriginCityName = null;
        java.lang.String modelDestinationCityName = null;
        java.lang.String modelThumbnail = null;
        java.lang.String mboundView1AndroidStringSetJourneyCityModelOriginCityNameModelDestinationCityName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.origin_city_name
                    modelOriginCityName = model.getOrigin_city_name();
                    // read model.destination_city_name
                    modelDestinationCityName = model.getDestination_city_name();
                    // read model.thumbnail
                    modelThumbnail = model.getThumbnail();
                }


                // read @android:string/set_journey_city
                mboundView1AndroidStringSetJourneyCityModelOriginCityNameModelDestinationCityName = mboundView1.getResources().getString(R.string.set_journey_city, modelOriginCityName, modelDestinationCityName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringSetJourneyCityModelOriginCityNameModelDestinationCityName);
            com.salampakistan.utils.BindingAdaptersKt.setImageUrl(this.mboundView2, modelThumbnail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}