// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApplicationModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> baseUrlProvider;

  public ApplicationModule_ProvideRetrofitFactory(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> baseUrlProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get(), baseUrlProvider.get());
  }

  public static ApplicationModule_ProvideRetrofitFactory create(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> baseUrlProvider) {
    return new ApplicationModule_ProvideRetrofitFactory(module, okHttpClientProvider, baseUrlProvider);
  }

  public static Retrofit provideRetrofit(ApplicationModule instance, OkHttpClient okHttpClient,
      String baseUrl) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(okHttpClient, baseUrl));
  }
}
