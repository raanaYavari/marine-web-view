// Generated by Dagger (https://dagger.dev).
package com.kasra.marine.data.repository;

import com.kasra.bime.data.room.DataBaseHelper;
import com.kasra.marine.data.network.ApiHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseRepositoryImpl_Factory implements Factory<BaseRepositoryImpl> {
  private final Provider<DataBaseHelper> dataBaseHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public BaseRepositoryImpl_Factory(Provider<DataBaseHelper> dataBaseHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    this.dataBaseHelperProvider = dataBaseHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public BaseRepositoryImpl get() {
    return newInstance(dataBaseHelperProvider.get(), apiHelperProvider.get());
  }

  public static BaseRepositoryImpl_Factory create(Provider<DataBaseHelper> dataBaseHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new BaseRepositoryImpl_Factory(dataBaseHelperProvider, apiHelperProvider);
  }

  public static BaseRepositoryImpl newInstance(DataBaseHelper dataBaseHelper, ApiHelper apiHelper) {
    return new BaseRepositoryImpl(dataBaseHelper, apiHelper);
  }
}
