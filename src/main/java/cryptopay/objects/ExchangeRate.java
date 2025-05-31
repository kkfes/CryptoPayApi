package cryptopay.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRate {
    @JsonProperty("is_valid")
    private Boolean isValid;
    @JsonProperty("is_crypto")
    private Boolean isCrypto;
    @JsonProperty("is_fiat")
    private Boolean isFiat;
    @JsonProperty("source")
    private String source;
    @JsonProperty("target")
    private String target;
    @JsonProperty("rate")
    private String rate;

    public Boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }
    public Boolean getIsCrypto() {
        return isCrypto;
    }
    public void setIsCrypto(Boolean isCrypto) {
        this.isCrypto = isCrypto;
    }
    public Boolean getIsFiat() {
        return isFiat;
    }
    public void setIsFiat(Boolean isFiat) {
        this.isFiat = isFiat;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public String getRate() {
        return rate;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
}