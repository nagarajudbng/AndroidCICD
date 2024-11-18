// Generated by Dagger (https://dagger.dev).
package com.dbng.core.di;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideContentResolverFactory implements Factory<ContentResolver> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideContentResolverFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public ContentResolver get() {
    return provideContentResolver(appProvider.get());
  }

  public static AppModule_ProvideContentResolverFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideContentResolverFactory(appProvider);
  }

  public static ContentResolver provideContentResolver(Context app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideContentResolver(app));
  }
}