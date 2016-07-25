package tr.edu.yildiz.dao.business;

import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.business.Employee;

import java.util.List;


public interface EmployeeDao extends BaseDao<Employee> {

    public List<Employee> findEmployee();

    public List<Employee> findByEmail(String email);

    public void updateEmployeeEmail(String employeeEmail, String newEmail);

    public void deleteEmployee(Integer id);
}
