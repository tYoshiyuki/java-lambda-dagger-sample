package lambdadagger.component;

import dagger.Component;
import lambdadagger.application.LambdaApplication;

@Component
public interface AppComponent {
    public LambdaApplication lambdaApplication();
}
