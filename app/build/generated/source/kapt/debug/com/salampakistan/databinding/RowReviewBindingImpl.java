package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowReviewBindingImpl extends RowReviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.destination_layout, 5);
        sViewsWithIds.put(R.id.travel_text, 6);
        sViewsWithIds.put(R.id.top_separator, 7);
        sViewsWithIds.put(R.id.type_layout, 8);
        sViewsWithIds.put(R.id.type_title, 9);
        sViewsWithIds.put(R.id.rating_layout, 10);
        sViewsWithIds.put(R.id.reviews_count_text, 11);
        sViewsWithIds.put(R.id.bottom_separator, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RatingBar mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowReviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private RowReviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            );
        this.descriptionText.setTag(null);
        this.destinationTitle.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.RatingBar) bindings[3];
        this.mboundView3.setTag(null);
        this.typeValueText.setTag(null);
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
            setModel((com.salampakistan.model.response.getreviewsresponse.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.salampakistan.model.response.getreviewsresponse.Data Model) {
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
        com.salampakistan.model.response.getreviewsresponse.Data model = mModel;
        java.lang.String modelTitle = null;
        java.lang.String modelDescription = null;
        java.lang.String modelType = null;
        float modelRating = 0f;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.title
                    modelTitle = model.getTitle();
                    // read model.description
                    modelDescription = model.getDescription();
                    // read model.type
                    modelType = model.getType();
                    // read model.rating
                    modelRating = model.getRating();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionText, modelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.destinationTitle, modelTitle);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.mboundView3, modelRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.typeValueText, modelType);
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