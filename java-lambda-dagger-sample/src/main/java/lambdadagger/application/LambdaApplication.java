package lambdadagger.application;

import lambdadagger.model.GatewayResponse;
import lambdadagger.service.AppService;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * メインとなるアプリケーションのクラスです
 */
public class LambdaApplication {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private AppService appService;

    @Getter
    private GatewayResponse response;

    @Inject
    public LambdaApplication(AppService appService) {
        this.appService = appService;
    }

    public void run() {
        try {
            before();
            main();
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        } finally {
            after();
        }
    }

    private void before() {
        logger.info("処理開始");
    }

    private void main() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");

        try {
            String contents = appService.getPageContents("https://checkip.amazonaws.com");
            String output = String.format("{ \"message\": \"hello world\", \"location\": \"%s\" }", contents);
            response = new GatewayResponse(output, headers, 200);
        } catch (IOException e) {
            response = new GatewayResponse("{}", headers, 500);
        }

    }

    private void after() {
        logger.info("処理終了");
    }


}
