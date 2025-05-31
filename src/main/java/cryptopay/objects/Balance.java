package cryptopay.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("available")
    private String available;
    @JsonProperty("onhold")
    private String onhold;

    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getAvailable() {
        return available;
    }
    public void setAvailable(String available) {
        this.available = available;
    }
    public String getOnhold() {
        return onhold;
    }
    public void setOnhold(String onhold) {
        this.onhold = onhold;
    }
}