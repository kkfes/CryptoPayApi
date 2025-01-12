package webhook;

import com.fasterxml.jackson.databind.ObjectMapper;
import objects.WebhookUpdate;
import spark.Request;
import spark.Response;

public class WebhookHandler {

    private final String appToken;
    private final ObjectMapper objectMapper;

    public WebhookHandler(String appToken) {
        this.appToken = appToken;
        this.objectMapper = new ObjectMapper();
    }

    /**
     * Обрабатывает входящий Spark Request для Webhook.
     * Если подпись неверна или происходит ошибка — возвращает null (или можно выбрасывать исключение).
     */
    public WebhookUpdate handle(Request request, Response response) {
        try {
            String body = request.body();
            String headerSignature = request.headers("crypto-pay-api-signature");
            if (!WebhookUtils.checkSignature(appToken, body, headerSignature)) {
                response.status(403);
                response.body("Invalid signature");
                return null;
            }
            WebhookUpdate update = objectMapper.readValue(body, WebhookUpdate.class);
            response.status(200);
            return update;
        } catch (Exception e) {
            e.printStackTrace();
            response.status(500);
            response.body("Error processing webhook");
            return null;
        }
    }
}