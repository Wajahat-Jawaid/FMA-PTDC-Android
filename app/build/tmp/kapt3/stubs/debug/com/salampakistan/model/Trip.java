package com.salampakistan.model;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0001OB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u00c1\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u001cJ\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\t\u0010A\u001a\u00020\bH\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u00c6\u0003J\u00e9\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u00c6\u0001J\b\u0010E\u001a\u00020\bH\u0016J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u00d6\u0003J\t\u0010J\u001a\u00020\bH\u00d6\u0001J\t\u0010K\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010L\u001a\u00020M2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\bH\u0016R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001e\u00a8\u0006P"}, d2 = {"Lcom/salampakistan/model/Trip;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "autoId", "", "trimmedSlug", "title", "description", "duration", "discount", "startingLocation", "whatsIncluded", "", "Lcom/salampakistan/model/TripWhatsIncluded;", "locations", "subLocations", "categories", "activities", "photos", "itinerary", "Lcom/salampakistan/model/Itinerary;", "thumbnail", "cancellationPolicy", "eventType", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivities", "()Ljava/util/List;", "getAutoId", "()I", "getCancellationPolicy", "()Ljava/lang/String;", "getCategories", "getDescription", "getDiscount", "getDuration", "getEventType", "getId", "getItinerary", "getLocations", "getPhotos", "getStartingLocation", "getSubLocations", "getThumbnail", "getTitle", "getTrimmedSlug", "getWhatsIncluded", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class Trip implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "_id")
    private final java.lang.String id = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int autoId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String trimmedSlug = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int duration = 0;
    private final int discount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startingLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.salampakistan.model.TripWhatsIncluded> whatsIncluded = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> locations = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> subLocations = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> activities = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> photos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.salampakistan.model.Itinerary> itinerary = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String thumbnail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cancellationPolicy = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String eventType = null;
    public static final com.salampakistan.model.Trip.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int getAutoId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrimmedSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public final int getDiscount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartingLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.TripWhatsIncluded> getWhatsIncluded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSubLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.Itinerary> getItinerary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCancellationPolicy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEventType() {
        return null;
    }
    
    public Trip(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int autoId, @org.jetbrains.annotations.NotNull()
    java.lang.String trimmedSlug, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int duration, int discount, @org.jetbrains.annotations.NotNull()
    java.lang.String startingLocation, @org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.TripWhatsIncluded> whatsIncluded, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> locations, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> subLocations, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> activities, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.Itinerary> itinerary, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String cancellationPolicy, @org.jetbrains.annotations.NotNull()
    java.lang.String eventType) {
        super();
    }
    
    public Trip(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.TripWhatsIncluded> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.Itinerary> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    /**
     * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.Trip copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int autoId, @org.jetbrains.annotations.NotNull()
    java.lang.String trimmedSlug, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int duration, int discount, @org.jetbrains.annotations.NotNull()
    java.lang.String startingLocation, @org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.TripWhatsIncluded> whatsIncluded, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> locations, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> subLocations, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> activities, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.Itinerary> itinerary, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String cancellationPolicy, @org.jetbrains.annotations.NotNull()
    java.lang.String eventType) {
        return null;
    }
    
    /**
     * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/salampakistan/model/Trip$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/salampakistan/model/Trip;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/salampakistan/model/Trip;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.salampakistan.model.Trip> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.salampakistan.model.Trip createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.salampakistan.model.Trip[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}