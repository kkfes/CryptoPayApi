package cryptopay.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetStatsRequest {
    @JsonProperty("start_at")
    private String startAt;
    @JsonProperty("end_at")
    private String endAt;

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