package lambdadagger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lambdadagger.component.DaggerAppComponent;
import lambdadagger.application.LambdaApplication;

/**
 * Handler for requests to Lambda function.
 */
public class LambdaHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        LambdaApplication app = DaggerAppComponent.create().lambdaApplication();
        app.run();
        return app.getResponse();
    }
}
