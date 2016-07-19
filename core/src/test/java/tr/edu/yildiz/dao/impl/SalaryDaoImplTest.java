package tr.edu.yildiz.dao.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.SalaryDao;
import tr.edu.yildiz.domain.student.Employee;
import tr.edu.yildiz.domain.student.Salary;
import tr.edu.yildiz.test.GenericTest;

import java.util.Date;

import static org.junit.Assert.*;

public class SalaryDaoImplTest extends GenericTest {

    @Autowired
    private SalaryDao salaryDao;

    @Test
    public void shouldFindByEmployee() {
        Salary salary = createSalary();

        salaryDao.save(salary);

    }

    private Salary createSalary() {
        Employee employee = createEmployee();
        Salary salary = new Salary();

        salary.setAmount(10);
        salary.setPaymentDate(new Date());
        salary.setEmployee(employee);
        salary.setEmployeeId(employee.getEmployeeID());

        return salary;
    }

    private Employee createEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeEmail("test");
        employee.setEmployeeName("");

        return employee;
    }


}