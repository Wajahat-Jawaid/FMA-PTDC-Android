package com.salampakistan.ui.fragments.wishlist;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/salampakistan/ui/fragments/wishlist/WishlistListFragment;", "Lcom/salampakistan/base/BaseListFragment;", "Lcom/salampakistan/databinding/FragmentListBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "adapter", "Lcom/salampakistan/ui/fragments/wishlist/WishlistAdapter;", "binding", "viewModel", "Lcom/salampakistan/ui/fragments/wishlist/WishlistViewModel;", "wishlist", "", "Lcom/salampakistan/model/WishList;", "addToPlan", "", "getData", "getTitle", "", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "removeFromWishList", "index", "id", "Companion", "app_debug"})
public final class WishlistListFragment extends com.salampakistan.base.BaseListFragment<com.salampakistan.databinding.FragmentListBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.wishlist.WishlistViewModel viewModel;
    private com.salampakistan.databinding.FragmentListBinding binding;
    private final com.salampakistan.ui.fragments.wishlist.WishlistAdapter adapter = null;
    private java.util.List<com.salampakistan.model.WishList> wishlist;
    public static final com.salampakistan.ui.fragments.wishlist.WishlistListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getData() {
    }
    
    private final void removeFromWishList(int index, java.lang.String id) {
    }
    
    private final void addToPlan() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salampakistan.databinding.FragmentListBinding injectBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public WishlistListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/wishlist/WishlistListFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/wishlist/WishlistListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.wishlist.WishlistListFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}