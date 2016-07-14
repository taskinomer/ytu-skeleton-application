package tr.edu.yildiz.domain.student;

import javax.persistence.*;

/**
 * Created by abozyel on 14/07/16.
 */

@Entity
@Table (name = "employee")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "EMPLOYEE_ID")
    private Integer employeeID;

    @Column (name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column (name = "EMPLOYEE_EMAİL")
    private String employeeEmail;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }



}
