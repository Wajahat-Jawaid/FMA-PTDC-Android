package com.salampakistan.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0007\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a \u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u001a\"\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u0005H\u0007\u001a\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\"\u001a\u001a\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u001a\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\tH\u0007\u001a2\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\t2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0007\u001a\u0018\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0007\u001a\u0018\u0010/\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0007\u001a\u0018\u00100\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0007\u001a\u0018\u00101\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0007\u001a \u00102\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000104H\u0007\u001a \u00105\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020-2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u000104H\u0007\u001a\u0018\u00105\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020-2\u0006\u00106\u001a\u00020+H\u0007\u001a \u00107\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0007\u001a\u0018\u0010:\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005H\u0007\u001a2\u0010=\u001a\u00020\u0001\"\u0004\b\u0000\u0010>2\u0006\u0010?\u001a\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0004\u0012\u0002H>\u0018\u00010Aj\n\u0012\u0004\u0012\u0002H>\u0018\u0001`BH\u0007\u001a&\u0010=\u001a\u00020\u0001\"\u0004\b\u0000\u0010>2\u0006\u0010?\u001a\u00020\u00102\u000e\u0010@\u001a\n\u0012\u0004\u0012\u0002H>\u0018\u00010CH\u0007\u001a\u0018\u0010D\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0005H\u0007\u00a8\u0006G"}, d2 = {"formatValueWithZero", "", "view", "Landroid/widget/TextView;", "value", "", "getDrawable", "Landroid/graphics/drawable/Drawable;", "iconName", "", "context", "Landroid/content/Context;", "getPerNightIntSpannable", "amount", "getPerPersonIntSpannable", "setAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setCityState", "model", "Lcom/salampakistan/model/hotelsearchresponse/Hotel;", "setDateText", "startDate", "", "endDate", "setDrawableTint", "textView", "alignment", "Lcom/salampakistan/utils/TintDrawableAlignment;", "color", "setImageDrawable", "Landroid/widget/ImageView;", "src", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "setImageResource", "setImageUrl", "url", "setImageUrlWithCustomDimensions", "width", "", "height", "shouldNotUsePlaceholder", "", "setLayoutMarginBottom", "Landroid/view/View;", "dimen", "setLayoutMarginEnd", "setLayoutMarginStart", "setLayoutMarginTop", "setMutableText", "text", "Landroidx/lifecycle/MutableLiveData;", "setMutableVisibility", "visibility", "setPriceText", "price", "currency", "setRatingBarProgress", "Landroid/widget/RatingBar;", "stars", "setRecyclerViewItems", "T", "recyclerView", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "setprogressBarProgress", "Landroid/widget/ProgressBar;", "progress", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"adapter"})
    public static final void setAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"items"})
    public static final <T extends java.lang.Object>void setRecyclerViewItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"items"})
    public static final <T extends java.lang.Object>void setRecyclerViewItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<T> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"visibilityGone"})
    public static final void setMutableVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visibility) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mutableVisibility"})
    public static final void setMutableVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> visibility) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mutableText"})
    public static final void setMutableText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> text) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageResourceDrawable"})
    public static final void setImageResource(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String iconName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.Nullable()
    java.lang.String iconName, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageSrc"})
    public static final void setImageDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.Integer src) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"imageUrlCustomDimensions", "width", "height", "shouldNotUsePlaceholder"})
    public static final void setImageUrlWithCustomDimensions(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, float width, float height, boolean shouldNotUsePlaceholder) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"priceText", "currency"})
    public static final void setPriceText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"zeroFormattedValue"})
    public static final void formatValueWithZero(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int value) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"drawableAlignment", "drawableTint"})
    public static final void setDrawableTint(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    com.salampakistan.utils.TintDrawableAlignment alignment, @androidx.annotation.ColorInt()
    int color) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"marginStart"})
    public static final void setLayoutMarginStart(@org.jetbrains.annotations.NotNull()
    android.view.View view, float dimen) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"marginEnd"})
    public static final void setLayoutMarginEnd(@org.jetbrains.annotations.NotNull()
    android.view.View view, float dimen) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"marginTop"})
    public static final void setLayoutMarginTop(@org.jetbrains.annotations.NotNull()
    android.view.View view, float dimen) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"marginBottom"})
    public static final void setLayoutMarginBottom(@org.jetbrains.annotations.NotNull()
    android.view.View view, float dimen) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setProgress"})
    public static final void setRatingBarProgress(@org.jetbrains.annotations.NotNull()
    android.widget.RatingBar view, int stars) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setProgressbarProgress"})
    public static final void setprogressBarProgress(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar view, int progress) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setText"})
    public static final void getPerNightIntSpannable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int amount) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setPerpersonText"})
    public static final void getPerPersonIntSpannable(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int amount) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setCityText"})
    public static final void setCityState(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.hotelsearchresponse.Hotel model) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setStartDate", "setEndDate"})
    public static final void setDateText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, long startDate, long endDate) {
    }
}