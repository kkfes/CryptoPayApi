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
    private Result result;

    public boolean isOk() {
        return ok;
    }
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        @JsonProperty("items")
        private List<Check> items;

        public List<Check> getItems() {
            return items;
        }

        public void setItems(List<Check> items) {
            this.items = items;
        }
    }
}