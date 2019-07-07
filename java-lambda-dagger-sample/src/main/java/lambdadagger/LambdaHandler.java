package lambdadagger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lambdadagger.component.DaggerAppComponent;
import lambdadagger.application.LambdaApplication;

/**
 * Lambda関数のエントリーポイント
 */
public class LambdaHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        LambdaApplication app = DaggerAppComponent.create().lambdaApplication();
        app.run();
        return app.getResponse();
    }
}
