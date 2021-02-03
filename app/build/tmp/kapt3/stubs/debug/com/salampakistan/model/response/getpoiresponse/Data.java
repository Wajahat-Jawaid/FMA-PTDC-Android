package com.salampakistan.model.response.getpoiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0013H\u00c6\u0003J\t\u00103\u001a\u00020\u0015H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\fH\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\u00ab\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\'R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001b\u00a8\u0006E"}, d2 = {"Lcom/salampakistan/model/response/getpoiresponse/Data;", "", "__v", "", "_id", "", "business_status", "dist", "Lcom/salampakistan/model/response/getpoiresponse/Dist;", "formatted_address", "icon", "location", "Lcom/salampakistan/model/response/getpoiresponse/Location;", "name", "photos", "", "Lcom/salampakistan/model/response/getpoiresponse/Photo;", "place_id", "plus_code", "Lcom/salampakistan/model/response/getpoiresponse/PlusCode;", "rating", "", "reference", "types", "user_ratings_total", "(ILjava/lang/String;Ljava/lang/String;Lcom/salampakistan/model/response/getpoiresponse/Dist;Ljava/lang/String;Ljava/lang/String;Lcom/salampakistan/model/response/getpoiresponse/Location;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/salampakistan/model/response/getpoiresponse/PlusCode;DLjava/lang/String;Ljava/util/List;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBusiness_status", "getDist", "()Lcom/salampakistan/model/response/getpoiresponse/Dist;", "getFormatted_address", "getIcon", "getLocation", "()Lcom/salampakistan/model/response/getpoiresponse/Location;", "getName", "getPhotos", "()Ljava/util/List;", "getPlace_id", "getPlus_code", "()Lcom/salampakistan/model/response/getpoiresponse/PlusCode;", "getRating", "()D", "getReference", "getTypes", "getUser_ratings_total", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Data {
    private final int __v = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String business_status = null;
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.model.response.getpoiresponse.Dist dist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String formatted_address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.model.response.getpoiresponse.Location location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.salampakistan.model.response.getpoiresponse.Photo> photos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String place_id = null;
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.model.response.getpoiresponse.PlusCode plus_code = null;
    private final double rating = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reference = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> types = null;
    private final int user_ratings_total = 0;
    
    public final int get__v() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBusiness_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.Dist getDist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormatted_address() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.response.getpoiresponse.Photo> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlace_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.PlusCode getPlus_code() {
        return null;
    }
    
    public final double getRating() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTypes() {
        return null;
    }
    
    public final int getUser_ratings_total() {
        return 0;
    }
    
    public Data(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String business_status, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.response.getpoiresponse.Dist dist, @org.jetbrains.annotations.NotNull()
    java.lang.String formatted_address, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.response.getpoiresponse.Location location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.response.getpoiresponse.Photo> photos, @org.jetbrains.annotations.NotNull()
    java.lang.String place_id, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.response.getpoiresponse.PlusCode plus_code, double rating, @org.jetbrains.annotations.NotNull()
    java.lang.String reference, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> types, int user_ratings_total) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.Dist component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.Location component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.salampakistan.model.response.getpoiresponse.Photo> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.PlusCode component11() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.model.response.getpoiresponse.Data copy(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String business_status, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.response.getpoiresponse.Dist dist, @org.jetbrains.annotations.NotNull()
    java.lang.String formatted_address, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.response.getpoiresponse.Location location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.salampakistan.model.response.getpoiresponse.Photo> photos, @org.jetbrains.annotations.NotNull()
    java.lang.String place_id, @org.jetbrains.annotations.NotNull()
    com.salampakistan.model.response.getpoiresponse.PlusCode plus_code, double rating, @org.jetbrains.annotations.NotNull()
    java.lang.String reference, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> types, int user_ratings_total) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}