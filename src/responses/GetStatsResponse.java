package responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import objects.AppStats;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetStatsResponse {
    @JsonProperty("ok")
    private boolean ok;
    @JsonProperty("result")
    private AppStats result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public AppStats getResult() {
        return result;
    }
    public void setResult(AppStats result) {
        this.result = result;
    }
}