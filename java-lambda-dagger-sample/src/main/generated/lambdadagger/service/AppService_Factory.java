package lambdadagger.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppService_Factory implements Factory<AppService> {
  private static final AppService_Factory INSTANCE = new AppService_Factory();

  @Override
  public AppService get() {
    return provideInstance();
  }

  public static AppService provideInstance() {
    return new AppService();
  }

  public static AppService_Factory create() {
    return INSTANCE;
  }

  public static AppService newAppService() {
    return new AppService();
  }
}
