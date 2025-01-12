package responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCheckResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private Check result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public Check getResult() {
        return result;
    }
    public void setResult(Check result) {
        this.result = result;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Check {
        @JsonProperty("check_id")
        private Long checkId;
        @JsonProperty("asset")
        private String asset;
        @JsonProperty("amount")
        private String amount;
        @JsonProperty("pin_to_user_id")
        private Long pinToUserId;
        @JsonProperty("pin_to_username")
        private String pinToUsername;

        public Long getCheckId() {
            return checkId;
        }
        public void setCheckId(Long checkId) {
            this.checkId = checkId;
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
}
