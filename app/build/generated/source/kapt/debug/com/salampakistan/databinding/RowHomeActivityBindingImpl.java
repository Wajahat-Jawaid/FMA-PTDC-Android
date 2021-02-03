package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowHomeActivityBindingImpl extends RowHomeActivityBinding  {

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
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.view.View mboundView2;
    @NonNull
    private final android.view.View mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowHomeActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RowHomeActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.image.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.view.View) bindings[3];
        this.mboundView3.setTag(null);
        this.moreText.setTag(null);
        this.title.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.salampakistan.model.Activity) variable);
        }
        else if (BR.isLastItem == variableId) {
            setIsLastItem((java.lang.Boolean) variable);
        }
        else if (BR.moreCount == variableId) {
            setMoreCount((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.salampakistan.model.Activity Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setIsLastItem(@Nullable java.lang.Boolean IsLastItem) {
        this.mIsLastItem = IsLastItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isLastItem);
        super.requestRebind();
    }
    public void setMoreCount(@Nullable java.lang.Integer MoreCount) {
        this.mMoreCount = MoreCount;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.moreCount);
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
        com.salampakistan.model.Activity model = mModel;
        java.lang.Boolean isLastItem = mIsLastItem;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLastItem = false;
        java.lang.String isLastItemModelNameTitleAndroidStringExploreMore = null;
        java.lang.Integer moreCount = mMoreCount;
        boolean IsLastItem1 = false;
        java.lang.String moreTextAndroidStringPlusCountMoreCount = null;
        java.lang.String modelName = null;
        java.lang.String modelThumbnail = null;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxIsLastItem1 = false;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.thumbnail
                    modelThumbnail = model.getThumbnail();
                }
        }
        if ((dirtyFlags & 0xbL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLastItem)
                androidxDatabindingViewDataBindingSafeUnboxIsLastItem = androidx.databinding.ViewDataBinding.safeUnbox(isLastItem);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(isLastItem)
                IsLastItem1 = !androidxDatabindingViewDataBindingSafeUnboxIsLastItem;
            if((dirtyFlags & 0xbL) != 0) {
                if(IsLastItem1) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }

            if ((dirtyFlags & 0xaL) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(isLastItem))
                    AndroidxDatabindingViewDataBindingSafeUnboxIsLastItem1 = androidx.databinding.ViewDataBinding.safeUnbox(IsLastItem1);
            }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read @android:string/plus_count
                moreTextAndroidStringPlusCountMoreCount = moreText.getResources().getString(R.string.plus_count, moreCount);
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {



                if (model != null) {
                    // read model.name
                    modelName = model.getName();
                }
        }

        if ((dirtyFlags & 0xbL) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(isLastItem) ? model.name : @android:string/explore_more
                isLastItemModelNameTitleAndroidStringExploreMore = ((IsLastItem1) ? (modelName) : (title.getResources().getString(R.string.explore_more)));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setImageUrlWithCustomDimensions(this.image, modelThumbnail, (float)0f, (float)0f, true);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView2, AndroidxDatabindingViewDataBindingSafeUnboxIsLastItem1);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxIsLastItem);
            com.salampakistan.utils.BindingAdaptersKt.setMutableVisibility(this.moreText, androidxDatabindingViewDataBindingSafeUnboxIsLastItem);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.moreText, moreTextAndroidStringPlusCountMoreCount);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, isLastItemModelNameTitleAndroidStringExploreMore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): isLastItem
        flag 2 (0x3L): moreCount
        flag 3 (0x4L): null
        flag 4 (0x5L): !androidx.databinding.ViewDataBinding.safeUnbox(isLastItem) ? model.name : @android:string/explore_more
        flag 5 (0x6L): !androidx.databinding.ViewDataBinding.safeUnbox(isLastItem) ? model.name : @android:string/explore_more
    flag mapping end*/
    //end
}