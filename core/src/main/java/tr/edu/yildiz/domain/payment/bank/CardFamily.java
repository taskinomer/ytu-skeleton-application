package tr.edu.yildiz.domain.payment.bank;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "card_family")
public class CardFamily implements Serializable {

    private static final long serialVersionUID = 5088890394523768579L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CARD_FAMILY_ID")
    private Integer cardFamilyId;

    @Column(name = "IDATE", nullable = false, columnDefinition = "TIMESTAMP")
    private Date insertDate;

    @Column(name = "UDATE", columnDefinition = "TIMESTAMP")
    private Date updateDate;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "CARD_FAMILY_TYPE", length = 15, nullable = false)
    private String cardFamilyType;

    @Column(name = "THREED_ENABLED", length = 1, nullable = false)
    private Boolean threeDEnable;

    @Column(name = "MIN_CHARGE_AMOUNT", precision = 5, scale = 2, nullable = false)
    private BigDecimal minChargeAmount;

    @Column(name = "UI_LOGO_KEY", length = 20, nullable = false)
    private String uiLogoKey;

    @ManyToOne
    @JoinColumn(name = "BANK_ID", referencedColumnName = "BANK_ID")
    private Bank bank;


    public Integer getCardFamilyId() {
        return cardFamilyId;
    }

    public void setCardFamilyId(Integer cardFamilyId) {
        this.cardFamilyId = cardFamilyId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

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

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
