package cryptopay.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.Check;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetChecksResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private List<Check> result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public List<Check> getResult() {
        return result;
    }
    public void setResult(List<Check> result) {
        this.result = result;
    }
}