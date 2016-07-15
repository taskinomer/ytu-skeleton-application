package tr.edu.yildiz.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.EmployeeDao;
import tr.edu.yildiz.domain.student.Employee;
import tr.edu.yildiz.test.GenericTest;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeDaoImplTest extends GenericTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findEmployee() throws Exception {
        // data olusturma
        Employee employee = new Employee();
        employee.setEmployeeName("asdasd");
        employee.setEmployeeEmail("sadasd");

        employeeDao.saveOrUpdate(employee);


        // testini yazdığın methodu çağır
        List<Employee> employees = employeeDao.findEmployee();

        // assertion
        Assert.assertNotNull(employees);
        Assert.assertTrue(employees.size() == 1);
        Assert.assertEquals(employees.get(0).getEmployeeEmail(), employee.getEmployeeEmail());
        Assert.assertEquals(employees.get(0).getEmployeeName(), employee.getEmployeeName());
        Assert.assertTrue(employees.get(0).getEmployeeID() > 0);
    }

}