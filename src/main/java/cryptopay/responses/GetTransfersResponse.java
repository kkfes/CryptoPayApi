package cryptopay.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.Transfer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTransfersResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private List<Transfer> result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public List<Transfer> getResult() {
        return result;
    }
    public void setResult(List<Transfer> result) {
        this.result = result;
    }
}
