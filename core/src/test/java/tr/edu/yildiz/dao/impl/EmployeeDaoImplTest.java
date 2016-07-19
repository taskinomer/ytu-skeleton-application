package tr.edu.yildiz.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.EmployeeDao;
import tr.edu.yildiz.domain.student.Employee;
import tr.edu.yildiz.domain.student.Salary;
import tr.edu.yildiz.test.GenericTest;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeDaoImplTest extends GenericTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findEmployee() throws Exception {
        // data olusturma
        Employee employee = getEmployee("");

        // testini yazdığın methodu çağır
        List<Employee> employees = employeeDao.findEmployee();

        // assertion
        Assert.assertNotNull(employees);
        Assert.assertTrue(employees.size() == 1);
        Assert.assertEquals(employees.get(0).getEmployeeEmail(), employee.getEmployeeEmail());
        Assert.assertEquals(employees.get(0).getEmployeeName(), employee.getEmployeeName());
        Assert.assertTrue(employees.get(0).getEmployeeID() > 0);
    }

    protected Employee getEmployee(String email) {
        Employee employee = new Employee();
        employee.setEmployeeName("default name");
        employee.setEmployeeEmail(email);

        Salary salary = new Salary();
        salary.setPaymentDate(new Date());
        salary.setAmount(10);

        employee.getSalaries().add(salary);

        employeeDao.saveOrUpdate(employee);

        return employee;
    }

    @Test
    public void updateEmployeeEmail() throws Exception {
        String email = "a@b.com";
        getEmployee(email);

        String newEmail = "b@c.com";
        employeeDao.updateEmployeeEmail(email, newEmail);

        List<Employee> byEmail = employeeDao.findByEmail(newEmail);
        Assert.assertTrue(byEmail.size() > 0);
    }

    @Test
    public void deleteEmployee() throws Exception {
        Integer id=1;
        String email="a@b.com";
        getEmployee(email);

        employeeDao.deleteEmployee(id);

        List<Employee> findEmployee1 = employeeDao.findEmployee();
        Assert.assertFalse(findEmployee1.size() > 0);

    }
}