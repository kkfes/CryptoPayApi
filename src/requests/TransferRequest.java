package requests;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-запрос для перевода средств.
 */
public class TransferRequest {

    @JsonProperty("user_id")
    private long userId;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("spend_id")
    private String spendId; // Уникальный ID для предотвращения повторов

    public TransferRequest() {
    }

    public TransferRequest(long userId, String asset, double amount, String spendId) {
        this.userId = userId;
        this.asset = asset;
        this.amount = amount;
        this.spendId = spendId;
    }

    public long getUserId() {
        return userId;
    }

    public String getAsset() {
        return asset;
    }

    public double getAmount() {
        return amount;
    }

    public String getSpendId() {
        return spendId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSpendId(String spendId) {
        this.spendId = spendId;
    }
}
