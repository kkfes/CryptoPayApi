package cryptopay.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.Invoice;

/**
 * DTO-ответ для createInvoice.
 * Использует общий класс Invoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInvoiceResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("result")
    private Invoice result;

    public boolean isOk() {
        return ok;
    }

    public Invoice getResult() {
        return result;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setResult(Invoice result) {
        this.result = result;
    }
}
