package lambdadagger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import lambdadagger.model.GatewayResponse;
import org.junit.Test;

public class LambdaHandlerTest {
    @Test
    public void successfulResponse() {
        LambdaHandler lambdaHandler = new LambdaHandler();
        GatewayResponse result = (GatewayResponse) lambdaHandler.handleRequest(null, null);
        assertEquals(result.getStatusCode(), 200);
        assertEquals(result.getHeaders().get("Content-Type"), "application/json");
        String content = result.getBody();
        assertNotNull(content);
        assertTrue(content.contains("\"message\""));
        assertTrue(content.contains("\"hello world\""));
        assertTrue(content.contains("\"location\""));
    }
}
