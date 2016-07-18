package tr.edu.yildiz.dao.impl;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.EmployeeDao;
import tr.edu.yildiz.domain.student.Employee;

import java.util.List;

@Repository
@Transactional
public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao {

    @Override
    public List<Employee> findEmployee() {

        List<Employee> list = getSessionFactory().getCurrentSession()
                .createQuery("select e from Employee e").list();

        return list;
    }

    @Override
    public List<Employee> findByEmail(String email) {

        return getSessionFactory().getCurrentSession()
                .createQuery("select e from Employee e where e.employeeEmail = :employeeEmail")
                .setParameter("employeeEmail", email).list();

    }

    @Override
    public void updateEmployeeEmail(String employeeEmail, String newEmail) {

        getSessionFactory().getCurrentSession()
                .createQuery("update Employee e set e.employeeEmail = :newEmail where e.employeeEmail = :employeeEmail")
                .setParameter("employeeEmail", employeeEmail)
                .setParameter("newEmail", newEmail)
                .executeUpdate();
    }

    @Override
    public void deleteEmployee(Integer id) {
        getSessionFactory().getCurrentSession().createQuery("DELETE FROM Employee WHERE id= :employeeID");

//        Employee foundEmployee = (Employee) getSessionFactory().getCurrentSession().get(Employee.class, id);
//        getSessionFactory().getCurrentSession().delete(foundEmployee);
    }
}
