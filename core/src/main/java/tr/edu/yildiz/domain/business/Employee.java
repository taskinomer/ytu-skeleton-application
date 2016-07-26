package tr.edu.yildiz.domain.business;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "employee")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "EMPLOYEE_ID")
    private Integer employeeID;

    @Column (name = "EMPLOYEE_NAME")
    private String employeeName;

//    @OneToOne
    @Column(name = "EMPLOYEE_EMAIL")
    private String employeeEmail;

    //Bir employeenin birden cok maası olur calistigi sure boyunca her ay yatacak
    @OneToMany (mappedBy = "employee")
    private List<Salary> salaries = new ArrayList<>();

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
