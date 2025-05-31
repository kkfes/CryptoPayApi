package cryptopay.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCurrenciesResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private List<String> result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public List<String> getResult() {
        return result;
    }
    public void setResult(List<String> result) {
        this.result = result;
    }
}