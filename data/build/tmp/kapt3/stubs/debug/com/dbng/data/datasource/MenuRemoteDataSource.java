package com.dbng.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/dbng/data/datasource/MenuRemoteDataSource;", "", "menuApiService", "Lcom/dbng/data/network/MenuApiService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/dbng/data/network/MenuApiService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "fetchMenuItemMoreInfo", "Lretrofit2/Response;", "Lcom/dbng/data/model/menuresponse/MenuItem;", "itemID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMenuItems", "Lcom/dbng/data/model/menuresponse/MenuResponse;", "from", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class MenuRemoteDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.dbng.data.network.MenuApiService menuApiService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject
    public MenuRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.dbng.data.network.MenuApiService menuApiService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchMenuItems(int from, int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dbng.data.model.menuresponse.MenuResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchMenuItemMoreInfo(int itemID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dbng.data.model.menuresponse.MenuItem>> $completion) {
        return null;
    }
}