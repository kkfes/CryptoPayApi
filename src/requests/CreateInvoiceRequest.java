package requests;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-запрос для создания инвойса.
 */
public class CreateInvoiceRequest {

    @JsonProperty("asset")
    private String asset; // Например: "BTC", "TON", "USDT", "ETH" и т.д.

    @JsonProperty("amount")
    private double amount; // Сумма инвойса

    public CreateInvoiceRequest() {
    }

    public CreateInvoiceRequest(String asset, double amount) {
        this.asset = asset;
        this.amount = amount;
    }

    public String getAsset() {
        return asset;
    }

    public double getAmount() {
        return amount;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
