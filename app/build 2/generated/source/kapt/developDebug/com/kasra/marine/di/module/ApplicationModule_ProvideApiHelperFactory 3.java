// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.di.module;

import com.kasra.marine.data.network.ApiHelper;
import com.kasra.marine.data.network.ApiHelperImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiHelperFactory implements Factory<ApiHelper> {
  private final ApplicationModule module;

  private final Provider<ApiHelperImpl> apiHelperImplProvider;

  public ApplicationModule_ProvideApiHelperFactory(ApplicationModule module,
      Provider<ApiHelperImpl> apiHelperImplProvider) {
    this.module = module;
    this.apiHelperImplProvider = apiHelperImplProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper(module, apiHelperImplProvider.get());
  }

  public static ApplicationModule_ProvideApiHelperFactory create(ApplicationModule module,
      Provider<ApiHelperImpl> apiHelperImplProvider) {
    return new ApplicationModule_ProvideApiHelperFactory(module, apiHelperImplProvider);
  }

  public static ApiHelper provideApiHelper(ApplicationModule instance,
      ApiHelperImpl apiHelperImpl) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiHelper(apiHelperImpl));
  }
}
