package tr.edu.yildiz.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "member")
public class Member implements Serializable {

    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
