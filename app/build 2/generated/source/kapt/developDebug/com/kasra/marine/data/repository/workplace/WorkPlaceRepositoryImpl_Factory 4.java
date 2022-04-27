// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.data.repository.workplace;

import com.kasra.bime.data.room.DataBaseHelper;
import com.kasra.marine.data.network.ApiHelper;
import com.kasra.marine.data.network.OAuthInterceptor;
import com.kasra.marine.data.prefrences.AppPrefrencesHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WorkPlaceRepositoryImpl_Factory implements Factory<WorkPlaceRepositoryImpl> {
  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<AppPrefrencesHelper> preferencesProvider;

  private final Provider<DataBaseHelper> dataBaseHelperProvider;

  private final Provider<OAuthInterceptor> authProvider;

  public WorkPlaceRepositoryImpl_Factory(Provider<ApiHelper> apiHelperProvider,
      Provider<AppPrefrencesHelper> preferencesProvider,
      Provider<DataBaseHelper> dataBaseHelperProvider, Provider<OAuthInterceptor> authProvider) {
    this.apiHelperProvider = apiHelperProvider;
    this.preferencesProvider = preferencesProvider;
    this.dataBaseHelperProvider = dataBaseHelperProvider;
    this.authProvider = authProvider;
  }

  @Override
  public WorkPlaceRepositoryImpl get() {
    return newInstance(apiHelperProvider.get(), preferencesProvider.get(), dataBaseHelperProvider.get(), authProvider.get());
  }

  public static WorkPlaceRepositoryImpl_Factory create(Provider<ApiHelper> apiHelperProvider,
      Provider<AppPrefrencesHelper> preferencesProvider,
      Provider<DataBaseHelper> dataBaseHelperProvider, Provider<OAuthInterceptor> authProvider) {
    return new WorkPlaceRepositoryImpl_Factory(apiHelperProvider, preferencesProvider, dataBaseHelperProvider, authProvider);
  }

  public static WorkPlaceRepositoryImpl newInstance(ApiHelper apiHelper,
      AppPrefrencesHelper preferences, DataBaseHelper dataBaseHelper, OAuthInterceptor auth) {
    return new WorkPlaceRepositoryImpl(apiHelper, preferences, dataBaseHelper, auth);
  }
}