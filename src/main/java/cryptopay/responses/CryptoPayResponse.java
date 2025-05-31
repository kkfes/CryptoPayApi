package cryptopay.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Универсальный DTO для базового ответа от Crypto Pay API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CryptoPayResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("result")
    private Object result; // Можно заменить на подходящий тип, если известна структура

    public boolean isOk() {
        return ok;
    }

    public Object getResult() {
        return result;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
