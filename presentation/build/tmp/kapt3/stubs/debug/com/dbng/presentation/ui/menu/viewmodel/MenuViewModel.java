package com.dbng.presentation.ui.menu.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/dbng/presentation/ui/menu/viewmodel/MenuViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchMenuItemsUseCase", "Lcom/dbng/domain/usecase/FetchMenuItemsUseCase;", "menuItemMoreInfoUseCase", "Lcom/dbng/domain/usecase/MenuItemMoreInfoUseCase;", "(Lcom/dbng/domain/usecase/FetchMenuItemsUseCase;Lcom/dbng/domain/usecase/MenuItemMoreInfoUseCase;)V", "_detailItems", "Landroidx/compose/runtime/MutableState;", "Lcom/dbng/domain/model/MenuItem;", "_items", "", "_menuState", "Lcom/dbng/presentation/ui/menu/utils/MenuUIState;", "currentIndex", "", "detailItems", "getDetailItems", "()Landroidx/compose/runtime/MutableState;", "isLoading", "", "setLoading", "(Landroidx/compose/runtime/MutableState;)V", "items", "getItems", "menuState", "getMenuState", "pageSize", "fetchMenuItemDetails", "", "itemID", "fetchMenuList", "getResponseStatusMessage", "", "response", "Lcom/dbng/core/domain/utils/ResponseError;", "updateMenuUIState", "success", "Lcom/dbng/presentation/ui/menu/utils/MenuUIState$Success;", "presentation_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MenuViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dbng.domain.usecase.FetchMenuItemsUseCase fetchMenuItemsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.dbng.domain.usecase.MenuItemMoreInfoUseCase menuItemMoreInfoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.dbng.presentation.ui.menu.utils.MenuUIState> _menuState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.dbng.presentation.ui.menu.utils.MenuUIState> menuState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.dbng.domain.model.MenuItem>> _items = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.dbng.domain.model.MenuItem>> items = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.dbng.domain.model.MenuItem> _detailItems = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.dbng.domain.model.MenuItem> detailItems = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Boolean> isLoading;
    private int currentIndex = 0;
    private int pageSize = 20;
    
    @javax.inject.Inject
    public MenuViewModel(@org.jetbrains.annotations.NotNull
    com.dbng.domain.usecase.FetchMenuItemsUseCase fetchMenuItemsUseCase, @org.jetbrains.annotations.NotNull
    com.dbng.domain.usecase.MenuItemMoreInfoUseCase menuItemMoreInfoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.dbng.presentation.ui.menu.utils.MenuUIState> getMenuState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.dbng.domain.model.MenuItem>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.dbng.domain.model.MenuItem> getDetailItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    public final void fetchMenuList() {
    }
    
    public final void fetchMenuItemDetails(int itemID) {
    }
    
    private final java.lang.String getResponseStatusMessage(com.dbng.core.domain.utils.ResponseError response) {
        return null;
    }
    
    public final void updateMenuUIState(@org.jetbrains.annotations.NotNull
    com.dbng.presentation.ui.menu.utils.MenuUIState.Success success) {
    }
}