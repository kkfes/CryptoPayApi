package cryptopay.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transfer {
    @JsonProperty("transfer_id")
    private Long transferId;
    @JsonProperty("spend_id")
    private String spendId;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("asset")
    private String asset;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("status")
    private String status;
    @JsonProperty("completed_at")
    private String completedAt;
    @JsonProperty("comment")
    private String comment;

    public Long getTransferId() {
        return transferId;
    }
    public void setTransferId(Long transferId) {
        this.transferId = transferId;
    }
    public String getSpendId() {
        return spendId;
    }
    public void setSpendId(String spendId) {
        this.spendId = spendId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getAsset() {
        return asset;
    }
    public void setAsset(String asset) {
        this.asset = asset;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
