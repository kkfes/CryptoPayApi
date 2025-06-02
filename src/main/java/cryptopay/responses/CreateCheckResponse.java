package cryptopay.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.Check;

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

}
