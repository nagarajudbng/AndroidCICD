package com.dbng.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/dbng/data/network/MenuApiService;", "", "fetchMenuItemMoreInfo", "Lretrofit2/Response;", "Lcom/dbng/data/model/menuresponse/MenuItem;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMenuItems", "Lcom/dbng/data/model/menuresponse/MenuResponse;", "from", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface MenuApiService {
    
    @retrofit2.http.GET(value = "recipes/list")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchMenuItems(@retrofit2.http.Query(value = "from")
    int from, @retrofit2.http.Query(value = "size")
    int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dbng.data.model.menuresponse.MenuResponse>> $completion);
    
    @retrofit2.http.GET(value = "recipes/get-more-info")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchMenuItemMoreInfo(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dbng.data.model.menuresponse.MenuItem>> $completion);
}