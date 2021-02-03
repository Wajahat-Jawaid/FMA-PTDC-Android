package com.salampakistan.ui.fragments.reviews;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/salampakistan/ui/fragments/reviews/ReviewsListFragment;", "Lcom/salampakistan/base/BaseListFragment;", "Lcom/salampakistan/databinding/FragmentListBinding;", "Lcom/salampakistan/dagger/Injectable;", "()V", "adapter", "Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "Lcom/salampakistan/databinding/RowReviewBinding;", "Lcom/salampakistan/model/response/getreviewsresponse/Data;", "getAdapter", "()Lcom/salampakistan/ui/adapters/SimpleListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "viewModel", "Lcom/salampakistan/ui/fragments/reviews/ReviewsListViewModel;", "fetchReviews", "", "getTitle", "", "getViewId", "", "injectBinding", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ReviewsListFragment extends com.salampakistan.base.BaseListFragment<com.salampakistan.databinding.FragmentListBinding> implements com.salampakistan.dagger.Injectable {
    private com.salampakistan.ui.fragments.reviews.ReviewsListViewModel viewModel;
    private com.salampakistan.databinding.FragmentListBinding binding;
    private final kotlin.Lazy adapter$delegate = null;
    public static final com.salampakistan.ui.fragments.reviews.ReviewsListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.salampakistan.ui.adapters.SimpleListAdapter<com.salampakistan.databinding.RowReviewBinding, com.salampakistan.model.response.getreviewsresponse.Data> getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void fetchReviews() {
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
    
    public ReviewsListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/salampakistan/ui/fragments/reviews/ReviewsListFragment$Companion;", "", "()V", "getInstance", "Lcom/salampakistan/ui/fragments/reviews/ReviewsListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.salampakistan.ui.fragments.reviews.ReviewsListFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}