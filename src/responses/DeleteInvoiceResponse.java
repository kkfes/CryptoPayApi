package responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-ответ для удаления инвойса.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteInvoiceResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("result")
    private boolean result;

    public boolean isOk() {
        return ok;
    }

    public boolean isResult() {
        return result;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
