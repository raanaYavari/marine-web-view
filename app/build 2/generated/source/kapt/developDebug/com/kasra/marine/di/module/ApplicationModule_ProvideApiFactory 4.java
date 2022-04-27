// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.di.module;

import com.kasra.marine.data.network.ApiServices;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiFactory implements Factory<ApiServices> {
  private final ApplicationModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApplicationModule_ProvideApiFactory(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiServices get() {
    return provideApi(module, retrofitProvider.get());
  }

  public static ApplicationModule_ProvideApiFactory create(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApplicationModule_ProvideApiFactory(module, retrofitProvider);
  }

  public static ApiServices provideApi(ApplicationModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApi(retrofit));
  }
}