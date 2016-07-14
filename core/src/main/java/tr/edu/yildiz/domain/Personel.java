package tr.edu.yildiz.domain;

import javax.persistence.*;

/**
 * Created by mcengiz on 14/07/16.
 */


@Entity
@Table(name = "Personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSONEL_ID")
    private Integer personelId;

    @Column(name = "PERSONEL_NAME")
    private String personelName;

    @Column(name = "PERSONEL_MAIL")
    private String personelMail;


    public Integer getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Integer personelId) {
        this.personelId = personelId;
    }

    public String getPersonelMail() {
        return personelMail;
    }

    public void setPersonelMail(String personelMail) {
        this.personelMail = personelMail;
    }


    public String getPersonelName() {
        return personelName;
    }

    public void setPersonelName(String personelName) {
        this.personelName = personelName;
    }
}



