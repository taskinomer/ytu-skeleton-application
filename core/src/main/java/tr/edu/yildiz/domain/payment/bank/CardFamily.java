package tr.edu.yildiz.domain.payment.bank;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "CARD_FAMILY")
public class CardFamily {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CARD_FAMILY_ID")
    private Integer cardFamilyId;

    @Column(name = "IDATE", nullable = false)
    private LocalDateTime insertDate;

    @Column(name = "UDATE")
    private LocalDateTime updateDate;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "CARD_FAMILY_TYPE", length = 15, nullable = false)
    private String cardFamilyType;

    @Column(name = "THREED_ENABLED", length = 1, nullable = false)
    private Byte threeDEnable;

    @Column(name = "MIN_CHARGE_AMOUNT", precision = 5, scale = 2, nullable = false)
    private BigDecimal minChargeAmount;

    @Column(name = "UI_LOGO_KEY", length = 20, nullable = false)
    private String uiLogoKey;

    @ManyToOne
    @JoinColumn(name = "BANK_ID", referencedColumnName = "BANK_ID")
    private Bank bank;


//        KEY `FK_BANK_ID` (`BANK_ID`),
//        CONSTRAINT `card_family_ibfk_1` FOREIGN KEY (`BANK_ID`) REFERENCES `bank` (`BANK_ID`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin5

    public Integer getCardFamilyId() {
        return cardFamilyId;
    }

    public void setCardFamilyId(Integer cardFamilyId) {
        this.cardFamilyId = cardFamilyId;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
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

    public Byte getThreeDEnable() {
        return threeDEnable;
    }

    public void setThreeDEnable(Byte threeDEnable) {
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
