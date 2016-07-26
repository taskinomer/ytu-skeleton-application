package tr.edu.yildiz.domain.payment.bank;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "bank")

public class Bank implements Serializable {

    private static final long serialVersionUID = -8442353946731483761L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANK_ID")
    private Integer bankId;

    @Column(name = "IDATE", nullable = false, columnDefinition = "TIMESTAMP")
    private Date insertDate;

    @Column(name = "UDATE", columnDefinition = "TIMESTAMP")
    private Date updateDate;

    @Column(name = "NAME", length = 50, unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "bank",fetch = FetchType.EAGER)
    private List<CardFamily> cardFamilies;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankID) {
        this.bankId = bankID;
    }

    public List<CardFamily> getCardFamilies() {
        return cardFamilies;
    }

    public void setCardFamilies(List<CardFamily> cardFamilies) {
        this.cardFamilies = cardFamilies;
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

    public String getName(String garanti) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
