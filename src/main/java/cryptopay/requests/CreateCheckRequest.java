package cryptopay.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCheckRequest {
    @JsonProperty("asset")
    private String asset;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("pin_to_user_id")
    private Long pinToUserId;
    @JsonProperty("pin_to_username")
    private String pinToUsername;

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
    public Long getPinToUserId() {
        return pinToUserId;
    }
    public void setPinToUserId(Long pinToUserId) {
        this.pinToUserId = pinToUserId;
    }
    public String getPinToUsername() {
        return pinToUsername;
    }
    public void setPinToUsername(String pinToUsername) {
        this.pinToUsername = pinToUsername;
    }
}
