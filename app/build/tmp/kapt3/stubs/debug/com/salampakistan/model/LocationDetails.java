package com.salampakistan.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0085\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\fj\b\u0012\u0004\u0012\u00020\u0011`\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\b\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u00032\u0006\u0010\'\u001a\u00020#H\u0016R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\fj\b\u0012\u0004\u0012\u00020\u0011`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e\u00a8\u0006)"}, d2 = {"Lcom/salampakistan/model/LocationDetails;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "name", "description", "longDescription", "locationType", "thumbnails", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "slug", "photos", "surroundings", "Lcom/salampakistan/model/POI;", "location", "Lcom/salampakistan/model/LocationCoordinates;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/salampakistan/model/LocationCoordinates;)V", "getDescription", "()Ljava/lang/String;", "getId", "getLocation", "()Lcom/salampakistan/model/LocationCoordinates;", "getLocationType", "getLongDescription", "getName", "getPhotos", "()Ljava/util/ArrayList;", "getSlug", "getSurroundings", "getThumbnails", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "app_debug"})
public final class LocationDetails implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "_id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String longDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String locationType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> thumbnails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> photos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.salampakistan.model.POI> surroundings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.model.LocationCoordinates location = null;
    public static final com.salampakistan.model.LocationDetails.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.Nullable()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLongDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocationType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getThumbnails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.salampakistan.model.POI> getSurroundings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.LocationCoordinates getLocation() {
        return null;
    }
    
    public LocationDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String longDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String locationType, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> thumbnails, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.salampakistan.model.POI> surroundings, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.LocationCoordinates location) {
        super();
    }
    
    public LocationDetails(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/salampakistan/model/LocationDetails$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/salampakistan/model/Location;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/salampakistan/model/Location;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.salampakistan.model.Location> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.salampakistan.model.Location createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.salampakistan.model.Location[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}