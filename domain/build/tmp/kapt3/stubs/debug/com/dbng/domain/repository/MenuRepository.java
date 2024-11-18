package com.dbng.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0007H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/dbng/domain/repository/MenuRepository;", "", "fetchMenuItems", "Lcom/dbng/core/domain/Resource;", "", "Lcom/dbng/domain/model/MenuItem;", "from", "", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMenuItemsMoreInfo", "itemID", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalItemCount", "domain_debug"})
public abstract interface MenuRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchMenuItems(int from, int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dbng.core.domain.Resource<java.util.List<com.dbng.domain.model.MenuItem>>> $completion);
    
    public abstract int getTotalItemCount();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchMenuItemsMoreInfo(int itemID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dbng.core.domain.Resource<com.dbng.domain.model.MenuItem>> $completion);
}