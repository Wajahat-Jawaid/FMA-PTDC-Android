package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEventDetailsBindingImpl extends FragmentEventDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(27);
        sIncludes.setIncludes(0, 
            new String[] {"view_search_toolbar"},
            new int[] {12},
            new int[] {com.salampakistan.R.layout.view_search_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll_view, 13);
        sViewsWithIds.put(R.id.view6, 14);
        sViewsWithIds.put(R.id.view, 15);
        sViewsWithIds.put(R.id.view4, 16);
        sViewsWithIds.put(R.id.imageView, 17);
        sViewsWithIds.put(R.id.imageView3, 18);
        sViewsWithIds.put(R.id.textView23, 19);
        sViewsWithIds.put(R.id.textView24, 20);
        sViewsWithIds.put(R.id.linearLayout8, 21);
        sViewsWithIds.put(R.id.images_frame_layout, 22);
        sViewsWithIds.put(R.id.favorite_text, 23);
        sViewsWithIds.put(R.id.imageView_more, 24);
        sViewsWithIds.put(R.id.imageView_bookmark, 25);
        sViewsWithIds.put(R.id.rec_view_related_event, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEventDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentEventDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageButton) bindings[25]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (android.widget.ScrollView) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (com.salampakistan.databinding.ViewSearchToolbarBinding) bindings[12]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[14]
            );
        this.imageView4.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.textView18.setTag(null);
        this.textView19.setTag(null);
        this.textView21.setTag(null);
        this.textView22.setTag(null);
        this.textView3.setTag(null);
        this.textView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.model == variableId) {
            setModel((com.salampakistan.model.event.EventDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.salampakistan.model.event.EventDetails Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
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
        com.salampakistan.model.event.EventDetails model = mModel;
        java.lang.String modelProvince = null;
        long modelStartDate = 0;
        java.lang.String modelDescription = null;
        java.lang.Double modelLocationCoordinates1 = null;
        java.util.List<java.lang.String> modelThumbnails = null;
        java.lang.String modelCity = null;
        int modelPrice = 0;
        java.lang.String modelTitle = null;
        com.salampakistan.model.event.Location modelLocation = null;
        java.lang.String modelLocationCoordinates1ToString = null;
        java.lang.Double modelLocationCoordinates0 = null;
        java.util.List<java.lang.Double> modelLocationCoordinates = null;
        java.lang.String modelThumbnails0 = null;
        long modelEndDate = 0;
        java.lang.String modelLocationCoordinates0ToString = null;
        java.lang.String textView22AndroidStringSetLocationModelLocationCoordinates1ToStringModelLocationCoordinates0ToString = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (model != null) {
                    // read model.province
                    modelProvince = model.getProvince();
                    // read model.startDate
                    modelStartDate = model.getStartDate();
                    // read model.description
                    modelDescription = model.getDescription();
                    // read model.thumbnails
                    modelThumbnails = model.getThumbnails();
                    // read model.city
                    modelCity = model.getCity();
                    // read model.price
                    modelPrice = model.getPrice();
                    // read model.title
                    modelTitle = model.getTitle();
                    // read model.location
                    modelLocation = model.getLocation();
                    // read model.endDate
                    modelEndDate = model.getEndDate();
                }


                if (modelThumbnails != null) {
                    // read model.thumbnails[0]
                    modelThumbnails0 = getFromList(modelThumbnails, 0);
                }
                if (modelLocation != null) {
                    // read model.location.coordinates
                    modelLocationCoordinates = modelLocation.getCoordinates();
                }


                if (modelLocationCoordinates != null) {
                    // read model.location.coordinates[1]
                    modelLocationCoordinates1 = getFromList(modelLocationCoordinates, 1);
                    // read model.location.coordinates[0]
                    modelLocationCoordinates0 = getFromList(modelLocationCoordinates, 0);
                }


                if (modelLocationCoordinates1 != null) {
                    // read model.location.coordinates[1].toString()
                    modelLocationCoordinates1ToString = modelLocationCoordinates1.toString();
                }
                if (modelLocationCoordinates0 != null) {
                    // read model.location.coordinates[0].toString()
                    modelLocationCoordinates0ToString = modelLocationCoordinates0.toString();
                }


                // read @android:string/set_location
                textView22AndroidStringSetLocationModelLocationCoordinates1ToStringModelLocationCoordinates0ToString = textView22.getResources().getString(R.string.set_location, modelLocationCoordinates1ToString, modelLocationCoordinates0ToString);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setImageUrl(this.imageView4, modelThumbnails0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, modelTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, modelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, modelTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, modelDescription);
            com.salampakistan.utils.BindingAdaptersKt.setDateText(this.textView18, modelStartDate, modelEndDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView19, modelCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView21, modelProvince);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView22, textView22AndroidStringSetLocationModelLocationCoordinates1ToStringModelLocationCoordinates0ToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, modelTitle);
            com.salampakistan.utils.BindingAdaptersKt.getPerPersonIntSpannable(this.textView4, modelPrice);
        }
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}