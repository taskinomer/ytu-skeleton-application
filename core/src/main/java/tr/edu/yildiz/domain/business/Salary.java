package tr.edu.yildiz.domain.business;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Salary")
public class Salary {

    @Id
    @Column(name = "SALARY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer salaryId;

    @Column(name = "PAYMENT_DATE")
    private Date paymentDate;

    @Column(name = "AMOUNT")
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")
    private Employee employee;

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

