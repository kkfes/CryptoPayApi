package cryptopay.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import cryptopay.objects.Invoice;

import java.util.List;

/**
 * DTO-ответ для getInvoices.
 * Использует общий класс Invoice и содержит дополнительные метаданные.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInvoicesResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("result")
    private Result result;

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

    /**
     * Вложенный класс, содержащий массив инвойсов и метаданные.
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Result {

        @JsonProperty("items")
        private List<Invoice> items;

        @JsonProperty("count")
        private int count;

        @JsonProperty("offset")
        private Integer offset;

        @JsonProperty("limit")
        private Integer limit;

        public List<Invoice> getItems() {
            return items;
        }

        public void setItems(List<Invoice> items) {
            this.items = items;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
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
}
