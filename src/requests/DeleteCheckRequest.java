package requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteCheckRequest {
    @JsonProperty("check_id")
    private long checkId;

    public DeleteCheckRequest() {
    }
    public DeleteCheckRequest(long checkId) {
        this.checkId = checkId;
    }
    public long getCheckId() {
        return checkId;
    }
    public void setCheckId(long checkId) {
        this.checkId = checkId;
    }
}
