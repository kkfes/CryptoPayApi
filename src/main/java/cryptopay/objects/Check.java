package cryptopay.objects;

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
    private String bot_check_url;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("activated_at")
    private String activated_at;

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

    public String getBot_check_url() {
        return bot_check_url;
    }

    public void setBot_check_url(String bot_check_url) {
        this.bot_check_url = bot_check_url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getActivated_at() {
        return activated_at;
    }

    public void setActivated_at(String activated_at) {
        this.activated_at = activated_at;
    }
}