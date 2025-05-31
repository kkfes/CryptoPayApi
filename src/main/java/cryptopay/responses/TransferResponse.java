package cryptopay.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-ответ для перевода средств.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("result")
    private Result result;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        @JsonProperty("transfer_id")
        private Long transferId;

        public Long getTransferId() {
            return transferId;
        }

        public void setTransferId(Long transferId) {
            this.transferId = transferId;
        }
    }

    public boolean isOk() {
        return ok;
    }

    public Result getResult() {
        return result;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
