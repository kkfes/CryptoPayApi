package cryptopay;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import cryptopay.exceptions.CryptoPayApiException;
import cryptopay.requests.*;
import cryptopay.responses.*;

/**
 * Основной класс для работы с Crypto Pay API.
 * Позволяет выбрать сервер (тестовый или продакшн) через параметр конструктора.
 */
public class CryptoPayClient {

    private final String apiToken;
    private final String baseUrl;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public CryptoPayClient(String apiToken, boolean useTestServer) {
        this.apiToken = apiToken;
        this.baseUrl = useTestServer ? "https://testnet-pay.crypt.bot/api" : "https://pay.crypt.bot/api";
        this.httpClient = HttpClient.newBuilder()
                .build();
        this.objectMapper = new ObjectMapper();
    }

    public CryptoPayClient(String apiToken) {
        this(apiToken, false);
    }

    public CryptoPayResponse getMe() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getMe"))
                .header("Crypto-Pay-API-Token", apiToken)
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<CryptoPayResponse>() {
        });
    }

    public CreateInvoiceResponse createInvoice(CreateInvoiceRequest createInvoiceRequest)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(createInvoiceRequest);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/createInvoice"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<CreateInvoiceResponse>() {
        });
    }

    public TransferResponse transfer(TransferRequest transferRequest)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(transferRequest);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/transfer"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<TransferResponse>() {
        });
    }

    public DeleteInvoiceResponse deleteInvoice(long invoiceId)
            throws IOException, InterruptedException {
        DeleteInvoiceRequest body = new DeleteInvoiceRequest(invoiceId);
        String requestBody = objectMapper.writeValueAsString(body);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/deleteInvoice"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<DeleteInvoiceResponse>() {
        });
    }

    public GetInvoicesResponse getInvoices(GetInvoicesRequest requestObj)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(requestObj);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getInvoices"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetInvoicesResponse>() {
        });
    }

    public GetTransfersResponse getTransfers(GetTransfersRequest requestObj)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(requestObj);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getTransfers"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetTransfersResponse>() {
        });
    }

    public GetChecksResponse getChecks(GetChecksRequest requestObj)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(requestObj);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getChecks"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetChecksResponse>() {
        });
    }

    public CreateCheckResponse createCheck(CreateCheckRequest createCheckRequest)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(createCheckRequest);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/createCheck"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<CreateCheckResponse>() {
        });
    }

    public DeleteCheckResponse deleteCheck(long checkId)
            throws IOException, InterruptedException {
        DeleteCheckRequest body = new DeleteCheckRequest(checkId);
        String requestBody = objectMapper.writeValueAsString(body);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/deleteCheck"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<DeleteCheckResponse>() {
        });
    }

    public GetBalanceResponse getBalance() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getBalance"))
                .header("Crypto-Pay-API-Token", apiToken)
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetBalanceResponse>() {
        });
    }

    public GetExchangeRatesResponse getExchangeRates() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getExchangeRates"))
                .header("Crypto-Pay-API-Token", apiToken)
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetExchangeRatesResponse>() {
        });
    }

    public GetCurrenciesResponse getCurrencies() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getCurrencies"))
                .header("Crypto-Pay-API-Token", apiToken)
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetCurrenciesResponse>() {
        });
    }

    public GetStatsResponse getStats(GetStatsRequest requestObj)
            throws IOException, InterruptedException {
        String requestBody = objectMapper.writeValueAsString(requestObj);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/getStats"))
                .header("Crypto-Pay-API-Token", apiToken)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return parseResponse(response, new TypeReference<GetStatsResponse>() {
        });
    }

    private <T> T parseResponse(HttpResponse<String> response, TypeReference<T> typeReference) throws IOException {
        JsonNode root = objectMapper.readTree(response.body());
        if (!root.has("ok") || !root.get("ok").isBoolean()) {
            throw new IOException("Invalid response format: missing 'ok' field");
        }

        if (!root.get("ok").asBoolean()) {
            String errorCode = root.has("error") && root.get("error").has("code") ? root.get("error").get("code").asText() : "UNKNOWN";
            String errorMessage = root.has("error") && root.get("error").has("name") ? root.get("error").get("name").asText() : "Unknown error";
            try {
                throw new CryptoPayApiException(errorCode, errorMessage);
            } catch (CryptoPayApiException e) {
                throw new RuntimeException(e);
            }
        }

        return objectMapper.readValue(response.body(), typeReference);
    }
}