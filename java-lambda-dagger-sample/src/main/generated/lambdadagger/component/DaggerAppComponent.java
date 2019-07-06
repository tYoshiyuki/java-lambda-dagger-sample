package lambdadagger.component;

import javax.annotation.Generated;
import lambdadagger.application.LambdaApplication;
import lambdadagger.service.AppService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private DaggerAppComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @Override
  public LambdaApplication lambdaApplication() {
    return new LambdaApplication(new AppService());
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }
  }
}
