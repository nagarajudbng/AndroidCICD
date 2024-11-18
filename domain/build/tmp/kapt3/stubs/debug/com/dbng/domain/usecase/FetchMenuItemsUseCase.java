package com.dbng.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/dbng/domain/usecase/FetchMenuItemsUseCase;", "", "repository", "Lcom/dbng/domain/repository/MenuRepository;", "(Lcom/dbng/domain/repository/MenuRepository;)V", "totalItemsCount", "", "getTotalItemsCount", "()I", "setTotalItemsCount", "(I)V", "invoke", "Lcom/dbng/core/domain/Resource;", "", "Lcom/dbng/domain/model/MenuItem;", "from", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class FetchMenuItemsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.dbng.domain.repository.MenuRepository repository = null;
    private int totalItemsCount = 0;
    
    @javax.inject.Inject
    public FetchMenuItemsUseCase(@org.jetbrains.annotations.NotNull
    com.dbng.domain.repository.MenuRepository repository) {
        super();
    }
    
    public final int getTotalItemsCount() {
        return 0;
    }
    
    public final void setTotalItemsCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(int from, int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dbng.core.domain.Resource<java.util.List<com.dbng.domain.model.MenuItem>>> $completion) {
        return null;
    }
}