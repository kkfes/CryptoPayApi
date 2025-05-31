package cryptopay.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.Balance;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBalanceResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private List<Balance> result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public List<Balance> getResult() {
        return result;
    }
    public void setResult(List<Balance> result) {
        this.result = result;
    }
}