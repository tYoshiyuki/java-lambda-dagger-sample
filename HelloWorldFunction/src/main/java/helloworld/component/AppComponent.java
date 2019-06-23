package helloworld.component;

import dagger.Component;
import helloworld.lambda.LambdaApplication;

@Component
public interface AppComponent {
    public LambdaApplication lambdaApplication();
}
