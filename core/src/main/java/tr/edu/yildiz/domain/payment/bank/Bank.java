package tr.edu.yildiz.domain.payment.bank;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANK_ID")
    private Integer bankID;

    @Column(name = "IDATE", nullable = false)
    private LocalDateTime insertDate;

    @Column(name = "UDATE")
    private LocalDateTime updateDate;

    @Column(name = "NAME", length = 50, unique = true, nullable = false)
    private String name;

    public Integer getBankID() {
        return bankID;
    }

    public void setBankID(Integer bankID) {
        this.bankID = bankID;
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
}
