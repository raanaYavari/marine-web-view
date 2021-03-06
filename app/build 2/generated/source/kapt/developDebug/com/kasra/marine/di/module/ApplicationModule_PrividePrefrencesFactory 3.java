// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.di.module;

import com.kasra.marine.data.prefrences.AppPrefrencesHelper;
import com.kasra.marine.data.prefrences.AppPrefrencesImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_PrividePrefrencesFactory implements Factory<AppPrefrencesHelper> {
  private final ApplicationModule module;

  private final Provider<AppPrefrencesImpl> appPrefrencesImplProvider;

  public ApplicationModule_PrividePrefrencesFactory(ApplicationModule module,
      Provider<AppPrefrencesImpl> appPrefrencesImplProvider) {
    this.module = module;
    this.appPrefrencesImplProvider = appPrefrencesImplProvider;
  }

  @Override
  public AppPrefrencesHelper get() {
    return prividePrefrences(module, appPrefrencesImplProvider.get());
  }

  public static ApplicationModule_PrividePrefrencesFactory create(ApplicationModule module,
      Provider<AppPrefrencesImpl> appPrefrencesImplProvider) {
    return new ApplicationModule_PrividePrefrencesFactory(module, appPrefrencesImplProvider);
  }

  public static AppPrefrencesHelper prividePrefrences(ApplicationModule instance,
      AppPrefrencesImpl appPrefrencesImpl) {
    return Preconditions.checkNotNullFromProvides(instance.prividePrefrences(appPrefrencesImpl));
  }
}
