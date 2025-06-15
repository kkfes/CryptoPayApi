package cryptopay.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO-запрос для создания инвойса.
 */
public class CreateInvoiceRequest {

    @JsonProperty("currency_type")
    private String currencyType; // "crypto" или "fiat", по умолчанию "crypto"

    @JsonProperty("asset")
    private String asset; // Например: "BTC", "TON", "USDT", "ETH" и т.д.

    @JsonProperty("fiat")
    private String fiat; // Например: "USD", "EUR", "RUB" и т.д.

    @JsonProperty("accepted_assets")
    private String acceptedAssets; // Список криптовалют через запятую

    @JsonProperty("amount")
    private String amount; // Сумма инвойса в виде строки (например, "125.50")

    @JsonProperty("description")
    private String description; // Описание инвойса

    @JsonProperty("hidden_message")
    private String hiddenMessage; // Сообщение после оплаты

    @JsonProperty("paid_btn_name")
    private String paidBtnName; // Название кнопки после оплаты

    @JsonProperty("paid_btn_url")
    private String paidBtnUrl; // URL для кнопки после оплаты

    @JsonProperty("payload")
    private String payload; // Любые данные

    @JsonProperty("allow_comments")
    private Boolean allowComments; // Разрешить комментарии

    @JsonProperty("allow_anonymous")
    private Boolean allowAnonymous; // Разрешить анонимную оплату

    @JsonProperty("expires_in")
    private Integer expiresIn; // Время жизни инвойса в секундах

    public CreateInvoiceRequest() {
    }



    // Геттеры и сеттеры для всех полей

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getFiat() {
        return fiat;
    }

    public void setFiat(String fiat) {
        this.fiat = fiat;
    }

    public String getAcceptedAssets() {
        return acceptedAssets;
    }

    public void setAcceptedAssets(String acceptedAssets) {
        this.acceptedAssets = acceptedAssets;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHiddenMessage() {
        return hiddenMessage;
    }

    public void setHiddenMessage(String hiddenMessage) {
        this.hiddenMessage = hiddenMessage;
    }

    public String getPaidBtnName() {
        return paidBtnName;
    }

    public void setPaidBtnName(String paidBtnName) {
        this.paidBtnName = paidBtnName;
    }

    public String getPaidBtnUrl() {
        return paidBtnUrl;
    }

    public void setPaidBtnUrl(String paidBtnUrl) {
        this.paidBtnUrl = paidBtnUrl;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Boolean getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(Boolean allowComments) {
        this.allowComments = allowComments;
    }

    public Boolean getAllowAnonymous() {
        return allowAnonymous;
    }

    public void setAllowAnonymous(Boolean allowAnonymous) {
        this.allowAnonymous = allowAnonymous;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String currencyType;
        private String asset;
        private String fiat;
        private String acceptedAssets;
        private String amount;
        private String description;
        private String hiddenMessage;
        private String paidBtnName;
        private String paidBtnUrl;
        private String payload;
        private Boolean allowComments;
        private Boolean allowAnonymous;
        private Integer expiresIn;

        public Builder currencyType(String currencyType) {
            this.currencyType = currencyType;
            return this;
        }

        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        public Builder fiat(String fiat) {
            this.fiat = fiat;
            return this;
        }

        public Builder acceptedAssets(String acceptedAssets) {
            this.acceptedAssets = acceptedAssets;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder hiddenMessage(String hiddenMessage) {
            this.hiddenMessage = hiddenMessage;
            return this;
        }

        public Builder paidBtnName(String paidBtnName) {
            this.paidBtnName = paidBtnName;
            return this;
        }

        public Builder paidBtnUrl(String paidBtnUrl) {
            this.paidBtnUrl = paidBtnUrl;
            return this;
        }

        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        public Builder allowComments(Boolean allowComments) {
            this.allowComments = allowComments;
            return this;
        }

        public Builder allowAnonymous(Boolean allowAnonymous) {
            this.allowAnonymous = allowAnonymous;
            return this;
        }

        public Builder expiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        public CreateInvoiceRequest build() {
            CreateInvoiceRequest request = new CreateInvoiceRequest();
            request.setCurrencyType(currencyType);
            request.setAsset(asset);
            request.setFiat(fiat);
            request.setAcceptedAssets(acceptedAssets);
            request.setAmount(amount);
            request.setDescription(description);
            request.setHiddenMessage(hiddenMessage);
            request.setPaidBtnName(paidBtnName);
            request.setPaidBtnUrl(paidBtnUrl);
            request.setPayload(payload);
            request.setAllowComments(allowComments);
            request.setAllowAnonymous(allowAnonymous);
            request.setExpiresIn(expiresIn);
            return request;
        }
    }
}