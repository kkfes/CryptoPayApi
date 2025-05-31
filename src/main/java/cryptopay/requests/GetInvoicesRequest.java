package cryptopay.requests;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-запрос для получения инвойсов.
 * Если поля равны null, они не будут включены в JSON.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInvoicesRequest {

    @JsonProperty("invoice_ids")
    private List<Long> invoiceIds;

    @JsonProperty("status")
    private String status; // Например, "active" или "paid"

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("limit")
    private Integer limit;

    public GetInvoicesRequest() {
    }

    public GetInvoicesRequest(List<Long> invoiceIds, String status, Integer offset, Integer limit) {
        this.invoiceIds = invoiceIds;
        this.status = status;
        this.offset = offset;
        this.limit = limit;
    }

    public List<Long> getInvoiceIds() {
        return invoiceIds;
    }

    public void setInvoiceIds(List<Long> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
