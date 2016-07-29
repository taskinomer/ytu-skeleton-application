package tr.edu.yildiz.service.request;

import tr.edu.yildiz.domain.payment.bank.Bank;

import java.math.BigDecimal;
import java.util.Date;

public class CardFamilyRequest {
    private String name;
    private String cardFamilyType;
    private Boolean threeDEnable;
    private BigDecimal minChargeAmount;
    private String uiLogoKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardFamilyType() {
        return cardFamilyType;
    }

    public void setCardFamilyType(String cardFamilyType) {
        this.cardFamilyType = cardFamilyType;
    }

    public Boolean getThreeDEnable() {
        return threeDEnable;
    }

    public void setThreeDEnable(Boolean threeDEnable) {
        this.threeDEnable = threeDEnable;
    }

    public BigDecimal getMinChargeAmount() {
        return minChargeAmount;
    }

    public void setMinChargeAmount(BigDecimal minChargeAmount) {
        this.minChargeAmount = minChargeAmount;
    }

    public String getUiLogoKey() {
        return uiLogoKey;
    }

    public void setUiLogoKey(String uiLogoKey) {
        this.uiLogoKey = uiLogoKey;
    }
}
