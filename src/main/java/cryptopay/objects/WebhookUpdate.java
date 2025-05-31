package cryptopay.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookUpdate {
    @JsonProperty("update_id")
    private Long updateId;
    @JsonProperty("update_type")
    private String updateType;
    @JsonProperty("request_date")
    private String requestDate;
    @JsonProperty("payload")
    private Invoice payload;  // Предполагается, что payload имеет формат класса Invoice

    public Long getUpdateId() {
        return updateId;
    }
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
    public String getUpdateType() {
        return updateType;
    }
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }
    public String getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
    public Invoice getPayload() {
        return payload;
    }
    public void setPayload(Invoice payload) {
        this.payload = payload;
    }
}