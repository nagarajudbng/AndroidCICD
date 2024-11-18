package com.dbng.data.model.menuresponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001B\u00a9\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0019\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000fH\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010W\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010<J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0019\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u000fH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00b2\u0002\u0010j\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010kJ\u0013\u0010l\u001a\u00020\u00122\b\u0010m\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010n\u001a\u00020\u0003H\u00d6\u0001J\t\u0010o\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010\'R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010\'R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010\'R.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b:\u0010 \"\u0004\b;\u0010\"R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010?\u001a\u0004\b\u0011\u0010<\"\u0004\b=\u0010>R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010\'R \u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010\'R \u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010\'R \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010%\"\u0004\bG\u0010\'R.\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u000ej\b\u0012\u0004\u0012\u00020\u0018`\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00107\"\u0004\bI\u00109R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010\'R \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010%\"\u0004\bM\u0010\'R \u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010%\"\u0004\bO\u0010\'R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\bP\u0010 \"\u0004\bQ\u0010\"R \u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010%\"\u0004\bS\u0010\'\u00a8\u0006p"}, d2 = {"Lcom/dbng/data/model/menuresponse/Compilations;", "", "approvedAt", "", "aspectRatio", "", "beautyUrl", "buzzId", "canonicalId", "country", "createdAt", "description", "draftStatus", "facebookPosts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "id", "isShoppable", "", "keywords", "language", "name", "promotion", "show", "Lcom/dbng/data/model/menuresponse/Show;", "slug", "thumbnailAltText", "thumbnailUrl", "videoId", "videoUrl", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getApprovedAt", "()Ljava/lang/Integer;", "setApprovedAt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAspectRatio", "()Ljava/lang/String;", "setAspectRatio", "(Ljava/lang/String;)V", "getBeautyUrl", "setBeautyUrl", "getBuzzId", "setBuzzId", "getCanonicalId", "setCanonicalId", "getCountry", "setCountry", "getCreatedAt", "setCreatedAt", "getDescription", "setDescription", "getDraftStatus", "setDraftStatus", "getFacebookPosts", "()Ljava/util/ArrayList;", "setFacebookPosts", "(Ljava/util/ArrayList;)V", "getId", "setId", "()Ljava/lang/Boolean;", "setShoppable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getKeywords", "setKeywords", "getLanguage", "setLanguage", "getName", "setName", "getPromotion", "setPromotion", "getShow", "setShow", "getSlug", "setSlug", "getThumbnailAltText", "setThumbnailAltText", "getThumbnailUrl", "setThumbnailUrl", "getVideoId", "setVideoId", "getVideoUrl", "setVideoUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/dbng/data/model/menuresponse/Compilations;", "equals", "other", "hashCode", "toString", "data_debug"})
public final class Compilations {
    @com.google.gson.annotations.SerializedName(value = "approved_at")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer approvedAt;
    @com.google.gson.annotations.SerializedName(value = "aspect_ratio")
    @org.jetbrains.annotations.Nullable
    private java.lang.String aspectRatio;
    @com.google.gson.annotations.SerializedName(value = "beauty_url")
    @org.jetbrains.annotations.Nullable
    private java.lang.String beautyUrl;
    @com.google.gson.annotations.SerializedName(value = "buzz_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.String buzzId;
    @com.google.gson.annotations.SerializedName(value = "canonical_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.String canonicalId;
    @com.google.gson.annotations.SerializedName(value = "country")
    @org.jetbrains.annotations.Nullable
    private java.lang.String country;
    @com.google.gson.annotations.SerializedName(value = "created_at")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer createdAt;
    @com.google.gson.annotations.SerializedName(value = "description")
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @com.google.gson.annotations.SerializedName(value = "draft_status")
    @org.jetbrains.annotations.Nullable
    private java.lang.String draftStatus;
    @com.google.gson.annotations.SerializedName(value = "facebook_posts")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> facebookPosts;
    @com.google.gson.annotations.SerializedName(value = "id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    @com.google.gson.annotations.SerializedName(value = "is_shoppable")
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isShoppable;
    @com.google.gson.annotations.SerializedName(value = "keywords")
    @org.jetbrains.annotations.Nullable
    private java.lang.String keywords;
    @com.google.gson.annotations.SerializedName(value = "language")
    @org.jetbrains.annotations.Nullable
    private java.lang.String language;
    @com.google.gson.annotations.SerializedName(value = "name")
    @org.jetbrains.annotations.Nullable
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "promotion")
    @org.jetbrains.annotations.Nullable
    private java.lang.String promotion;
    @com.google.gson.annotations.SerializedName(value = "show")
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.dbng.data.model.menuresponse.Show> show;
    @com.google.gson.annotations.SerializedName(value = "slug")
    @org.jetbrains.annotations.Nullable
    private java.lang.String slug;
    @com.google.gson.annotations.SerializedName(value = "thumbnail_alt_text")
    @org.jetbrains.annotations.Nullable
    private java.lang.String thumbnailAltText;
    @com.google.gson.annotations.SerializedName(value = "thumbnail_url")
    @org.jetbrains.annotations.Nullable
    private java.lang.String thumbnailUrl;
    @com.google.gson.annotations.SerializedName(value = "video_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer videoId;
    @com.google.gson.annotations.SerializedName(value = "video_url")
    @org.jetbrains.annotations.Nullable
    private java.lang.String videoUrl;
    
    public Compilations(@org.jetbrains.annotations.Nullable
    java.lang.Integer approvedAt, @org.jetbrains.annotations.Nullable
    java.lang.String aspectRatio, @org.jetbrains.annotations.Nullable
    java.lang.String beautyUrl, @org.jetbrains.annotations.Nullable
    java.lang.String buzzId, @org.jetbrains.annotations.Nullable
    java.lang.String canonicalId, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.Integer createdAt, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String draftStatus, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> facebookPosts, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isShoppable, @org.jetbrains.annotations.Nullable
    java.lang.String keywords, @org.jetbrains.annotations.Nullable
    java.lang.String language, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String promotion, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.dbng.data.model.menuresponse.Show> show, @org.jetbrains.annotations.Nullable
    java.lang.String slug, @org.jetbrains.annotations.Nullable
    java.lang.String thumbnailAltText, @org.jetbrains.annotations.Nullable
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.Nullable
    java.lang.Integer videoId, @org.jetbrains.annotations.Nullable
    java.lang.String videoUrl) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getApprovedAt() {
        return null;
    }
    
    public final void setApprovedAt(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAspectRatio() {
        return null;
    }
    
    public final void setAspectRatio(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBeautyUrl() {
        return null;
    }
    
    public final void setBeautyUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBuzzId() {
        return null;
    }
    
    public final void setBuzzId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCanonicalId() {
        return null;
    }
    
    public final void setCanonicalId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDraftStatus() {
        return null;
    }
    
    public final void setDraftStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getFacebookPosts() {
        return null;
    }
    
    public final void setFacebookPosts(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isShoppable() {
        return null;
    }
    
    public final void setShoppable(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getKeywords() {
        return null;
    }
    
    public final void setKeywords(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPromotion() {
        return null;
    }
    
    public final void setPromotion(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.dbng.data.model.menuresponse.Show> getShow() {
        return null;
    }
    
    public final void setShow(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.dbng.data.model.menuresponse.Show> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getThumbnailAltText() {
        return null;
    }
    
    public final void setThumbnailAltText(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    public final void setThumbnailUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVideoId() {
        return null;
    }
    
    public final void setVideoId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVideoUrl() {
        return null;
    }
    
    public final void setVideoUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public Compilations() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.dbng.data.model.menuresponse.Show> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dbng.data.model.menuresponse.Compilations copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer approvedAt, @org.jetbrains.annotations.Nullable
    java.lang.String aspectRatio, @org.jetbrains.annotations.Nullable
    java.lang.String beautyUrl, @org.jetbrains.annotations.Nullable
    java.lang.String buzzId, @org.jetbrains.annotations.Nullable
    java.lang.String canonicalId, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.Integer createdAt, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String draftStatus, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> facebookPosts, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isShoppable, @org.jetbrains.annotations.Nullable
    java.lang.String keywords, @org.jetbrains.annotations.Nullable
    java.lang.String language, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String promotion, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.dbng.data.model.menuresponse.Show> show, @org.jetbrains.annotations.Nullable
    java.lang.String slug, @org.jetbrains.annotations.Nullable
    java.lang.String thumbnailAltText, @org.jetbrains.annotations.Nullable
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.Nullable
    java.lang.Integer videoId, @org.jetbrains.annotations.Nullable
    java.lang.String videoUrl) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}