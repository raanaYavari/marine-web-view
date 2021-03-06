// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.di.module;

import com.kasra.marine.data.repository.workplace.WorkPlaceRepository;
import com.kasra.marine.data.repository.workplace.WorkPlaceRepositoryImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideWorkPlaceRepositoryFactory implements Factory<WorkPlaceRepository> {
  private final ApplicationModule module;

  private final Provider<WorkPlaceRepositoryImpl> workPlaceRepositoryImplProvider;

  public ApplicationModule_ProvideWorkPlaceRepositoryFactory(ApplicationModule module,
      Provider<WorkPlaceRepositoryImpl> workPlaceRepositoryImplProvider) {
    this.module = module;
    this.workPlaceRepositoryImplProvider = workPlaceRepositoryImplProvider;
  }

  @Override
  public WorkPlaceRepository get() {
    return provideWorkPlaceRepository(module, workPlaceRepositoryImplProvider.get());
  }

  public static ApplicationModule_ProvideWorkPlaceRepositoryFactory create(ApplicationModule module,
      Provider<WorkPlaceRepositoryImpl> workPlaceRepositoryImplProvider) {
    return new ApplicationModule_ProvideWorkPlaceRepositoryFactory(module, workPlaceRepositoryImplProvider);
  }

  public static WorkPlaceRepository provideWorkPlaceRepository(ApplicationModule instance,
      WorkPlaceRepositoryImpl workPlaceRepositoryImpl) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorkPlaceRepository(workPlaceRepositoryImpl));
  }
}
