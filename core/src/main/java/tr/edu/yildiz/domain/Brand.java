package tr.edu.yildiz.domain;

import javax.persistence.*; // JPA
import java.util.Date;

@Entity
@Table(name = "Brand")
public class Brand {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.AUTO) // AI
    @Column(name = "BRAND_ID")
    private Integer brandId;

    @Column(name = "BRAND_NAME")
    private String brandName;

    @Column(name = "INSERT_DATE")
    private Date insertDate;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}

