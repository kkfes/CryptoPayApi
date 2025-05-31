package cryptopay.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.ExchangeRate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetExchangeRatesResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private List<ExchangeRate> result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public List<ExchangeRate> getResult() {
        return result;
    }
    public void setResult(List<ExchangeRate> result) {
        this.result = result;
    }
}