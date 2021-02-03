package com.salampakistan.databinding;
import com.salampakistan.R;
import com.salampakistan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.salampakistan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(30);
        sIncludes.setIncludes(2, 
            new String[] {"booking_menu_item", "booking_menu_item", "booking_menu_item", "booking_menu_item"},
            new int[] {3, 4, 5, 6},
            new int[] {com.salampakistan.R.layout.booking_menu_item,
                com.salampakistan.R.layout.booking_menu_item,
                com.salampakistan.R.layout.booking_menu_item,
                com.salampakistan.R.layout.booking_menu_item});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 7);
        sViewsWithIds.put(R.id.collapsing_toolbar, 8);
        sViewsWithIds.put(R.id.welcome_text, 9);
        sViewsWithIds.put(R.id.banner_text_separator, 10);
        sViewsWithIds.put(R.id.toolbar, 11);
        sViewsWithIds.put(R.id.toolbar_logo_img, 12);
        sViewsWithIds.put(R.id.banner_layout, 13);
        sViewsWithIds.put(R.id.toolbar_layout, 14);
        sViewsWithIds.put(R.id.search_btn, 15);
        sViewsWithIds.put(R.id.salam_changeable_text, 16);
        sViewsWithIds.put(R.id.pakistan_text, 17);
        sViewsWithIds.put(R.id.weather_layout, 18);
        sViewsWithIds.put(R.id.booking_and_reservation_text, 19);
        sViewsWithIds.put(R.id.lets_get_booking_text, 20);
        sViewsWithIds.put(R.id.t1, 21);
        sViewsWithIds.put(R.id.t2, 22);
        sViewsWithIds.put(R.id.where_to_go_layout, 23);
        sViewsWithIds.put(R.id.web_view, 24);
        sViewsWithIds.put(R.id.what_to_do_layout, 25);
        sViewsWithIds.put(R.id.seasons_layout, 26);
        sViewsWithIds.put(R.id.trips_you_cannot_miss_layout, 27);
        sViewsWithIds.put(R.id.expert_tips_layout, 28);
        sViewsWithIds.put(R.id.currency_layout, 29);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[19]
            , (com.salampakistan.databinding.BookingMenuItemBinding) bindings[6]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[8]
            , (android.widget.FrameLayout) bindings[29]
            , (android.widget.FrameLayout) bindings[28]
            , (com.salampakistan.databinding.BookingMenuItemBinding) bindings[4]
            , (com.salampakistan.databinding.BookingMenuItemBinding) bindings[3]
            , (com.salampakistan.databinding.BookingMenuItemBinding) bindings[5]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.FrameLayout) bindings[26]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (androidx.appcompat.widget.Toolbar) bindings[11]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.FrameLayout) bindings[27]
            , (android.widget.FrameLayout) bindings[18]
            , (android.webkit.WebView) bindings[24]
            , (android.widget.TextView) bindings[9]
            , (android.widget.FrameLayout) bindings[25]
            , (android.widget.FrameLayout) bindings[23]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.salampakistan.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        hotelBooking.invalidateAll();
        flightBooking.invalidateAll();
        include5.invalidateAll();
        busBooking.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (hotelBooking.hasPendingBindings()) {
            return true;
        }
        if (flightBooking.hasPendingBindings()) {
            return true;
        }
        if (include5.hasPendingBindings()) {
            return true;
        }
        if (busBooking.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.salampakistan.ui.fragments.home.HomeFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.salampakistan.ui.fragments.home.HomeFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        hotelBooking.setLifecycleOwner(lifecycleOwner);
        flightBooking.setLifecycleOwner(lifecycleOwner);
        include5.setLifecycleOwner(lifecycleOwner);
        busBooking.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclude5((com.salampakistan.databinding.BookingMenuItemBinding) object, fieldId);
            case 1 :
                return onChangeFlightBooking((com.salampakistan.databinding.BookingMenuItemBinding) object, fieldId);
            case 2 :
                return onChangeBusBooking((com.salampakistan.databinding.BookingMenuItemBinding) object, fieldId);
            case 3 :
                return onChangeHotelBooking((com.salampakistan.databinding.BookingMenuItemBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude5(com.salampakistan.databinding.BookingMenuItemBinding Include5, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFlightBooking(com.salampakistan.databinding.BookingMenuItemBinding FlightBooking, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBusBooking(com.salampakistan.databinding.BookingMenuItemBinding BusBooking, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHotelBooking(com.salampakistan.databinding.BookingMenuItemBinding HotelBooking, int fieldId) {
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
        com.salampakistan.ui.fragments.home.HomeFragment fragment = mFragment;
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.busBooking.setIcon(getRoot().getResources().getString(R.string.bus));
            this.busBooking.setName(getRoot().getResources().getString(R.string.bus));
            this.flightBooking.setIcon(getRoot().getResources().getString(R.string.flight));
            this.flightBooking.setName(getRoot().getResources().getString(R.string.flight));
            this.hotelBooking.setIcon(getRoot().getResources().getString(R.string.accomodation));
            this.hotelBooking.setName(getRoot().getResources().getString(R.string.hotels));
            this.include5.setIcon(getRoot().getResources().getString(R.string.train));
            this.include5.setName(getRoot().getResources().getString(R.string.trains));
            this.mboundView1.setOnClickListener(mCallback11);
        }
        executeBindingsOn(hotelBooking);
        executeBindingsOn(flightBooking);
        executeBindingsOn(include5);
        executeBindingsOn(busBooking);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.salampakistan.ui.fragments.home.HomeFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragment.onCheckVisaBtnClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include5
        flag 1 (0x2L): flightBooking
        flag 2 (0x3L): busBooking
        flag 3 (0x4L): hotelBooking
        flag 4 (0x5L): fragment
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}