package requests;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTransfersRequest {
    @JsonProperty("asset")
    private String asset;
    @JsonProperty("transfer_ids")
    private String transferIds;
    @JsonProperty("spend_id")
    private String spendId;
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
    public String getTransferIds() {
        return transferIds;
    }
    public void setTransferIds(String transferIds) {
        this.transferIds = transferIds;
    }
    public String getSpendId() {
        return spendId;
    }
    public void setSpendId(String spendId) {
        this.spendId = spendId;
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