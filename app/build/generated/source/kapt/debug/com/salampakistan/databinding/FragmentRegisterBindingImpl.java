package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.banner_layout, 4);
        sViewsWithIds.put(R.id.logo_icon, 5);
        sViewsWithIds.put(R.id.title_text, 6);
        sViewsWithIds.put(R.id.desc_text, 7);
        sViewsWithIds.put(R.id.first_name_text, 8);
        sViewsWithIds.put(R.id.last_name_text, 9);
        sViewsWithIds.put(R.id.mobile_text, 10);
        sViewsWithIds.put(R.id.email_text, 11);
        sViewsWithIds.put(R.id.gender_radio_group, 12);
        sViewsWithIds.put(R.id.male_radio_btn, 13);
        sViewsWithIds.put(R.id.female_radio_btn, 14);
        sViewsWithIds.put(R.id.pwd_text, 15);
        sViewsWithIds.put(R.id.cnfrm_pwd_text, 16);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.EditText) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[11]
            , (android.widget.RadioButton) bindings[14]
            , (android.widget.EditText) bindings[8]
            , (android.widget.RadioGroup) bindings[12]
            , (android.widget.EditText) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[15]
            , (android.widget.TextView) bindings[6]
            );
        this.dobText.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback12 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback13 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
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
            setFragment((com.salampakistan.ui.fragments.login.RegisterFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.login.RegisterFragment Fragment) {
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
        com.salampakistan.ui.fragments.login.RegisterFragment fragment = mFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.dobText.setOnClickListener(mCallback12);
            this.mboundView2.setOnClickListener(mCallback13);
            this.mboundView3.setOnClickListener(mCallback14);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.login.RegisterFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onLoginHereBtnClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.login.RegisterFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.showDatePicker();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.login.RegisterFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.register();
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