package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUpdateProfileBindingImpl extends FragmentUpdateProfileBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(1, 
            new String[] {"view_back_btn_black"},
            new int[] {11},
            new int[] {com.salampakistan.R.layout.view_back_btn_black});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout5, 12);
        sViewsWithIds.put(R.id.circleImageView, 13);
        sViewsWithIds.put(R.id.edit_image_text, 14);
        sViewsWithIds.put(R.id.cnic_text, 15);
        sViewsWithIds.put(R.id.gender_radio_group, 16);
        sViewsWithIds.put(R.id.pwd_title, 17);
        sViewsWithIds.put(R.id.pwd_text, 18);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.Button mboundView10;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUpdateProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentUpdateProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.salampakistan.databinding.ViewBackBtnBlackBinding) bindings[11]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[13]
            , (android.widget.EditText) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.EditText) bindings[3]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.EditText) bindings[4]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.dobText.setTag(null);
        this.editPhoneImgBtn.setTag(null);
        this.femaleRadioBtn.setTag(null);
        this.firstNameText.setTag(null);
        this.lastNameText.setTag(null);
        this.maleRadioBtn.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.Button) bindings[10];
        this.mboundView10.setTag(null);
        this.mobileText.setTag(null);
        this.toolbar.setTag(null);
        this.userText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        mCallback29 = new com.salampakistan.generated.callback.OnClickListener(this, 3);
        mCallback28 = new com.salampakistan.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        backBtnView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (backBtnView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.salampakistan.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setUser(@Nullable com.salampakistan.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        backBtnView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBackBtnView((com.salampakistan.databinding.ViewBackBtnBlackBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBackBtnView(com.salampakistan.databinding.ViewBackBtnBlackBinding BackBtnView, int fieldId) {
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
        boolean userGenderEqualsJavaLangStringMale = false;
        com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment fragment = mFragment;
        boolean userGenderEqualsJavaLangStringFemale = false;
        java.lang.String userFirstName = null;
        com.salampakistan.model.User user = mUser;
        java.lang.String userLastName = null;
        java.lang.String primitiveExtensionKtToDateUserDob = null;
        long userDob = 0;
        java.lang.String userGender = null;
        java.lang.String userMobile = null;
        java.lang.String userTextAndroidStringUserNameUserFirstNameUserLastName = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (user != null) {
                    // read user.firstName
                    userFirstName = user.getFirstName();
                    // read user.lastName
                    userLastName = user.getLastName();
                    // read user.dob
                    userDob = user.getDob();
                    // read user.gender
                    userGender = user.getGender();
                    // read user.mobile
                    userMobile = user.getMobile();
                }


                // read @android:string/user_name
                userTextAndroidStringUserNameUserFirstNameUserLastName = userText.getResources().getString(R.string.user_name, userFirstName, userLastName);
                // read PrimitiveExtensionKt.toDate(user.dob)
                primitiveExtensionKtToDateUserDob = com.salampakistan.utils.extension.PrimitiveExtensionKt.toDate(userDob);
                if (userGender != null) {
                    // read user.gender.equals("male")
                    userGenderEqualsJavaLangStringMale = userGender.equals("male");
                    // read user.gender.equals("female")
                    userGenderEqualsJavaLangStringFemale = userGender.equals("female");
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.dobText.setOnClickListener(mCallback27);
            this.editPhoneImgBtn.setOnClickListener(mCallback28);
            this.mboundView10.setOnClickListener(mCallback29);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dobText, primitiveExtensionKtToDateUserDob);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.femaleRadioBtn, userGenderEqualsJavaLangStringFemale);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstNameText, userFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastNameText, userLastName);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.maleRadioBtn, userGenderEqualsJavaLangStringMale);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mobileText, userMobile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userText, userTextAndroidStringUserNameUserFirstNameUserLastName);
        }
        executeBindingsOn(backBtnView);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.showDatePicker();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onSaveButtonClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.salampakistan.ui.fragments.profile.update.UpdateProfileFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onEditPasswordBtnClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): backBtnView
        flag 1 (0x2L): fragment
        flag 2 (0x3L): user
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}