package requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetChecksRequest {
    @JsonProperty("asset")
    private String asset;
    @JsonProperty("check_ids")
    private String checkIds;
    @JsonProperty("status")
    private String status;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("count")
    private Integer count;

    public String getAsset() {
        return asset;
    }
    public void setAsset(String asset) {
        this.asset = asset;
    }
    public String getCheckIds() {
        return checkIds;
    }
    public void setCheckIds(String checkIds) {
        this.checkIds = checkIds;
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
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
}