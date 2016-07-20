package tr.edu.yildiz.domain.payment.bank;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BIN_NUMBER")
public class BinNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BIN_NUMBER_ID", length = 11)
    private Integer binNumberId;

    @Column(name = "IDATE", nullable = false)
    private Timestamp insertDate;

    @Column(name = "UDATE")
    private Timestamp updateDate;

    @Column(name = "BIN", length = 10, nullable = false, unique = true)
    private String bin;

    @ManyToOne
    @JoinColumn(name = "CARD_FAMILY_ID", referencedColumnName = "CARD_FAMILY_ID")
    private CardFamily cardFamily;

    public Integer getBinNumberId() {
        return binNumberId;
    }

    public void setBinNumberId(Integer binNumberId) {
        this.binNumberId = binNumberId;
    }

    public Timestamp getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public CardFamily getCardFamily() {
        return cardFamily;
    }

    public void setCardFamily(CardFamily cardFamily) {
        this.cardFamily = cardFamily;
    }
}
