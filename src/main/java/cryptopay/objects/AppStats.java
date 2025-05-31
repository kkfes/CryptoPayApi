package cryptopay.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppStats {
    @JsonProperty("volume")
    private Number volume;
    @JsonProperty("conversion")
    private Number conversion;
    @JsonProperty("unique_users_count")
    private Number uniqueUsersCount;
    @JsonProperty("created_invoice_count")
    private Number createdInvoiceCount;
    @JsonProperty("paid_invoice_count")
    private Number paidInvoiceCount;
    @JsonProperty("start_at")
    private String startAt;
    @JsonProperty("end_at")
    private String endAt;

    public Number getVolume() {
        return volume;
    }
    public void setVolume(Number volume) {
        this.volume = volume;
    }
    public Number getConversion() {
        return conversion;
    }
    public void setConversion(Number conversion) {
        this.conversion = conversion;
    }
    public Number getUniqueUsersCount() {
        return uniqueUsersCount;
    }
    public void setUniqueUsersCount(Number uniqueUsersCount) {
        this.uniqueUsersCount = uniqueUsersCount;
    }
    public Number getCreatedInvoiceCount() {
        return createdInvoiceCount;
    }
    public void setCreatedInvoiceCount(Number createdInvoiceCount) {
        this.createdInvoiceCount = createdInvoiceCount;
    }
    public Number getPaidInvoiceCount() {
        return paidInvoiceCount;
    }
    public void setPaidInvoiceCount(Number paidInvoiceCount) {
        this.paidInvoiceCount = paidInvoiceCount;
    }
    public String getStartAt() {
        return startAt;
    }
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }
    public String getEndAt() {
        return endAt;
    }
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }
}