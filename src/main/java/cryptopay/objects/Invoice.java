package cryptopay.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Общий класс Invoice для использования в различных DTO.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Invoice {

    @JsonProperty("invoice_id")
    private Long invoiceId;

    @JsonProperty("hash")
    private String hash;

    @JsonProperty("currency_type")
    private String currencyType;

    @JsonProperty("asset")
    private String asset; // Если currency_type="crypto"

    @JsonProperty("fiat")
    private String fiat;  // Если currency_type="fiat"

    @JsonProperty("amount")
    private String amount; // В документации указан как String

    @JsonProperty("paid_asset")
    private String paidAsset; // Для fiat инвойсов, если status="paid"

    @JsonProperty("paid_amount")
    private String paidAmount; // Для fiat инвойсов, если status="paid"

    @JsonProperty("paid_fiat_rate")
    private String paidFiatRate; // Для fiat инвойсов, если status="paid"

    @JsonProperty("accepted_assets")
    private List<String> acceptedAssets; // Список доступных активов для оплаты (для fiat)

    @JsonProperty("fee_asset")
    private String feeAsset; // Если status="paid"

    @JsonProperty("fee_amount")
    private Number feeAmount; // Если status="paid"

    @JsonProperty("fee")
    private String fee; // (deprecated)

    @JsonProperty("pay_url")
    private String payUrl; // (deprecated)

    @JsonProperty("bot_invoice_url")
    private String botInvoiceUrl;

    @JsonProperty("mini_app_invoice_url")
    private String miniAppInvoiceUrl;

    @JsonProperty("web_app_invoice_url")
    private String webAppInvoiceUrl;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status; // "active", "paid", "expired"

    @JsonProperty("created_at")
    private String createdAt; // Дата в ISO 8601

    @JsonProperty("paid_usd_rate")
    private String paidUsdRate; // Если status="paid"

    @JsonProperty("usd_rate")
    private String usdRate; // (deprecated)

    @JsonProperty("allow_comments")
    private Boolean allowComments;

    @JsonProperty("allow_anonymous")
    private Boolean allowAnonymous;

    @JsonProperty("expiration_date")
    private String expirationDate; // ISO 8601 (если есть)

    @JsonProperty("paid_at")
    private String paidAt; // ISO 8601 (если status="paid")

    @JsonProperty("paid_anonymously")
    private Boolean paidAnonymously; // если инвойс оплачен анонимно

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("hidden_message")
    private String hiddenMessage;

    @JsonProperty("payload")
    private String payload;

    @JsonProperty("paid_btn_name")
    private String paidBtnName;

    @JsonProperty("paid_btn_url")
    private String paidBtnUrl;

    // Геттеры и сеттеры

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaidAsset() {
        return paidAsset;
    }

    public void setPaidAsset(String paidAsset) {
        this.paidAsset = paidAsset;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaidFiatRate() {
        return paidFiatRate;
    }

    public void setPaidFiatRate(String paidFiatRate) {
        this.paidFiatRate = paidFiatRate;
    }

    public List<String> getAcceptedAssets() {
        return acceptedAssets;
    }

    public void setAcceptedAssets(List<String> acceptedAssets) {
        this.acceptedAssets = acceptedAssets;
    }

    public String getFeeAsset() {
        return feeAsset;
    }

    public void setFeeAsset(String feeAsset) {
        this.feeAsset = feeAsset;
    }

    public Number getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Number feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getBotInvoiceUrl() {
        return botInvoiceUrl;
    }

    public void setBotInvoiceUrl(String botInvoiceUrl) {
        this.botInvoiceUrl = botInvoiceUrl;
    }

    public String getMiniAppInvoiceUrl() {
        return miniAppInvoiceUrl;
    }

    public void setMiniAppInvoiceUrl(String miniAppInvoiceUrl) {
        this.miniAppInvoiceUrl = miniAppInvoiceUrl;
    }

    public String getWebAppInvoiceUrl() {
        return webAppInvoiceUrl;
    }

    public void setWebAppInvoiceUrl(String webAppInvoiceUrl) {
        this.webAppInvoiceUrl = webAppInvoiceUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPaidUsdRate() {
        return paidUsdRate;
    }

    public void setPaidUsdRate(String paidUsdRate) {
        this.paidUsdRate = paidUsdRate;
    }

    public String getUsdRate() {
        return usdRate;
    }

    public void setUsdRate(String usdRate) {
        this.usdRate = usdRate;
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

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(String paidAt) {
        this.paidAt = paidAt;
    }

    public Boolean getPaidAnonymously() {
        return paidAnonymously;
    }

    public void setPaidAnonymously(Boolean paidAnonymously) {
        this.paidAnonymously = paidAnonymously;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHiddenMessage() {
        return hiddenMessage;
    }

    public void setHiddenMessage(String hiddenMessage) {
        this.hiddenMessage = hiddenMessage;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
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
}
