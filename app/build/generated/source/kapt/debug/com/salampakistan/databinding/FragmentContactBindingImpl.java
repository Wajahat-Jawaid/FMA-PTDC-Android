package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.contact_us_icon, 5);
        sViewsWithIds.put(R.id.contact_us_text, 6);
        sViewsWithIds.put(R.id.separator, 7);
        sViewsWithIds.put(R.id.email_icon, 8);
        sViewsWithIds.put(R.id.email_text, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    private OnClickListenerImpl mFragmentOnEmailTextClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mFragmentOnPhoneTextClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[7]
            );
        this.copyEmailIcon.setTag(null);
        this.copyPhoneIcon.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.phoneNumberText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback20 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
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
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.profile.ContactUsFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.profile.ContactUsFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
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
        com.salampakistan.ui.fragments.profile.ContactUsFragment fragment = mFragment;
        android.view.View.OnClickListener fragmentOnEmailTextClickedAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnPhoneTextClickedAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fragment != null) {
                    // read fragment::onEmailTextClicked
                    fragmentOnEmailTextClickedAndroidViewViewOnClickListener = (((mFragmentOnEmailTextClickedAndroidViewViewOnClickListener == null) ? (mFragmentOnEmailTextClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFragmentOnEmailTextClickedAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onPhoneTextClicked
                    fragmentOnPhoneTextClickedAndroidViewViewOnClickListener = (((mFragmentOnPhoneTextClickedAndroidViewViewOnClickListener == null) ? (mFragmentOnPhoneTextClickedAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mFragmentOnPhoneTextClickedAndroidViewViewOnClickListener).setValue(fragment));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.copyEmailIcon.setOnClickListener(mCallback20);
            this.copyPhoneIcon.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(fragmentOnEmailTextClickedAndroidViewViewOnClickListener);
            this.phoneNumberText.setOnClickListener(fragmentOnPhoneTextClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.salampakistan.ui.fragments.profile.ContactUsFragment value;
        public OnClickListenerImpl setValue(com.salampakistan.ui.fragments.profile.ContactUsFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onEmailTextClicked(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.salampakistan.ui.fragments.profile.ContactUsFragment value;
        public OnClickListenerImpl1 setValue(com.salampakistan.ui.fragments.profile.ContactUsFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPhoneTextClicked(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.profile.ContactUsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {



                    fragment.onCopyBtnClicked(copyPhoneIcon.getResources().getString(R.string.ptdc_phone));
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.profile.ContactUsFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {



                    fragment.onCopyBtnClicked(copyEmailIcon.getResources().getString(R.string.ptdc_email));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}