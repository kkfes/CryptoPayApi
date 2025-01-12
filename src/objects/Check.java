package objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Check {
    @JsonProperty("check_id")
    private Long checkId;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("asset")
    private String asset;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("bot_check_url")
    private String botCheckUrl;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("activated_at")
    private String activatedAt;

    public Long getCheckId() {
        return checkId;
    }
    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }
    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
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
    public String getBotCheckUrl() {
        return botCheckUrl;
    }
    public void setBotCheckUrl(String botCheckUrl) {
        this.botCheckUrl = botCheckUrl;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getActivatedAt() {
        return activatedAt;
    }
    public void setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
    }
}