package cryptopay.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-запрос для удаления инвойса.
 */
public class DeleteInvoiceRequest {

    @JsonProperty("invoice_id")
    private long invoiceId;

    public DeleteInvoiceRequest() {
    }

    public DeleteInvoiceRequest(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }
}
