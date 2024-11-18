package com.dbng.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/dbng/data/repository/MenuRepositoryImpl;", "Lcom/dbng/domain/repository/MenuRepository;", "menuRemoteDataSource", "Lcom/dbng/data/datasource/MenuRemoteDataSource;", "(Lcom/dbng/data/datasource/MenuRemoteDataSource;)V", "allMenuItems", "", "Lcom/dbng/domain/model/MenuItem;", "menuItemsCount", "", "fetchMenuItems", "Lcom/dbng/core/domain/Resource;", "", "from", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMenuItemsMoreInfo", "itemID", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalItemCount", "data_debug"})
public final class MenuRepositoryImpl implements com.dbng.domain.repository.MenuRepository {
    @org.jetbrains.annotations.NotNull
    private final com.dbng.data.datasource.MenuRemoteDataSource menuRemoteDataSource = null;
    private int menuItemsCount = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.dbng.domain.model.MenuItem> allMenuItems = null;
    
    public MenuRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.dbng.data.datasource.MenuRemoteDataSource menuRemoteDataSource) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object fetchMenuItems(int from, int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dbng.core.domain.Resource<java.util.List<com.dbng.domain.model.MenuItem>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    public int getTotalItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object fetchMenuItemsMoreInfo(int itemID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dbng.core.domain.Resource<com.dbng.domain.model.MenuItem>> $completion) {
        return null;
    }
}