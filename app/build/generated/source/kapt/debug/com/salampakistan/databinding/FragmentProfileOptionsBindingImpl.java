package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileOptionsBindingImpl extends FragmentProfileOptionsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"view_profile_option", "view_profile_option", "view_profile_option", "view_profile_option"},
            new int[] {2, 3, 4, 5},
            new int[] {com.salampakistan.R.layout.view_profile_option,
                com.salampakistan.R.layout.view_profile_option,
                com.salampakistan.R.layout.view_profile_option,
                com.salampakistan.R.layout.view_profile_option});
        sIncludes.setIncludes(1, 
            new String[] {"view_profile_option"},
            new int[] {6},
            new int[] {com.salampakistan.R.layout.view_profile_option});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_container, 7);
        sViewsWithIds.put(R.id.user_image, 8);
        sViewsWithIds.put(R.id.name_text, 9);
        sViewsWithIds.put(R.id.edit_icon, 10);
        sViewsWithIds.put(R.id.email_text, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final com.salampakistan.databinding.ViewProfileOptionBinding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileOptionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentProfileOptionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.salampakistan.databinding.ViewProfileOptionBinding) bindings[5]
            , (com.salampakistan.databinding.ViewProfileOptionBinding) bindings[3]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (com.salampakistan.databinding.ViewProfileOptionBinding) bindings[4]
            , (android.widget.ImageView) bindings[8]
            , (com.salampakistan.databinding.ViewProfileOptionBinding) bindings[2]
            );
        this.logoutLayout.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.salampakistan.databinding.ViewProfileOptionBinding) bindings[6];
        setContainedBinding(this.mboundView1);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        wishlistLayout.invalidateAll();
        contactUsLayout.invalidateAll();
        reviewLayout.invalidateAll();
        aboutUsLayout.invalidateAll();
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (wishlistLayout.hasPendingBindings()) {
            return true;
        }
        if (contactUsLayout.hasPendingBindings()) {
            return true;
        }
        if (reviewLayout.hasPendingBindings()) {
            return true;
        }
        if (aboutUsLayout.hasPendingBindings()) {
            return true;
        }
        if (mboundView1.hasPendingBindings()) {
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
        wishlistLayout.setLifecycleOwner(lifecycleOwner);
        contactUsLayout.setLifecycleOwner(lifecycleOwner);
        reviewLayout.setLifecycleOwner(lifecycleOwner);
        aboutUsLayout.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWishlistLayout((com.salampakistan.databinding.ViewProfileOptionBinding) object, fieldId);
            case 1 :
                return onChangeContactUsLayout((com.salampakistan.databinding.ViewProfileOptionBinding) object, fieldId);
            case 2 :
                return onChangeReviewLayout((com.salampakistan.databinding.ViewProfileOptionBinding) object, fieldId);
            case 3 :
                return onChangeAboutUsLayout((com.salampakistan.databinding.ViewProfileOptionBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWishlistLayout(com.salampakistan.databinding.ViewProfileOptionBinding WishlistLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContactUsLayout(com.salampakistan.databinding.ViewProfileOptionBinding ContactUsLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeReviewLayout(com.salampakistan.databinding.ViewProfileOptionBinding ReviewLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAboutUsLayout(com.salampakistan.databinding.ViewProfileOptionBinding AboutUsLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.aboutUsLayout.setIcon(getDrawableFromResource(getRoot(), R.drawable.ic_about_green_24dp));
            this.aboutUsLayout.setTitle(getRoot().getResources().getString(R.string.about_us));
            this.contactUsLayout.setIcon(getDrawableFromResource(getRoot(), R.drawable.ic_phone_green_24dp));
            this.contactUsLayout.setTitle(getRoot().getResources().getString(R.string.contact_us));
            this.mboundView1.setIcon(getDrawableFromResource(getRoot(), R.drawable.ic_logout_green_24dp));
            this.mboundView1.setTitle(getRoot().getResources().getString(R.string.logout));
            this.reviewLayout.setIcon(getDrawableFromResource(getRoot(), R.drawable.ic_phone_green_24dp));
            this.reviewLayout.setTitle(getRoot().getResources().getString(R.string.reviews_and_feedback));
            this.wishlistLayout.setIcon(getDrawableFromResource(getRoot(), R.drawable.ic_phone_green_24dp));
            this.wishlistLayout.setTitle(getRoot().getResources().getString(R.string.wishlist));
        }
        executeBindingsOn(wishlistLayout);
        executeBindingsOn(contactUsLayout);
        executeBindingsOn(reviewLayout);
        executeBindingsOn(aboutUsLayout);
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): wishlistLayout
        flag 1 (0x2L): contactUsLayout
        flag 2 (0x3L): reviewLayout
        flag 3 (0x4L): aboutUsLayout
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}