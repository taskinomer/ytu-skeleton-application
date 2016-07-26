package tr.edu.yildiz.domain.payment.bank;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "bin_number")
public class BinNumber implements Serializable {

    private static final long serialVersionUID = -7893119613476880790L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BIN_NUMBER_ID", length = 11)
    private Integer binNumberId;

    @Column(name = "IDATE", nullable = false, columnDefinition = "TIMESTAMP")
    private Date insertDate;

    @Column(name = "UDATE", columnDefinition = "TIMESTAMP")
    private Date updateDate;

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
