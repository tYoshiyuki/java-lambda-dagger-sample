package lambdadagger.application;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import lambdadagger.service.AppService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LambdaApplication_Factory implements Factory<LambdaApplication> {
  private final Provider<AppService> appServiceProvider;

  public LambdaApplication_Factory(Provider<AppService> appServiceProvider) {
    this.appServiceProvider = appServiceProvider;
  }

  @Override
  public LambdaApplication get() {
    return provideInstance(appServiceProvider);
  }

  public static LambdaApplication provideInstance(Provider<AppService> appServiceProvider) {
    return new LambdaApplication(appServiceProvider.get());
  }

  public static LambdaApplication_Factory create(Provider<AppService> appServiceProvider) {
    return new LambdaApplication_Factory(appServiceProvider);
  }

  public static LambdaApplication newLambdaApplication(AppService appService) {
    return new LambdaApplication(appService);
  }
}
