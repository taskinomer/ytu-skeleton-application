package tr.edu.yildiz.dao;


import tr.edu.yildiz.domain.student.Employee;

import java.util.List;

public interface EmployeeDao extends BaseDao<Employee> {


    List<Employee> findEmployee();

    List<Employee> findByEmail(String email);

    void updateEmployeeEmail(String employeeEmail, String email);

    void deleteEmployee(Integer employeeID);
}
