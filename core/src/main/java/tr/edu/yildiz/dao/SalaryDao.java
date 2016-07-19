package tr.edu.yildiz.dao;


import tr.edu.yildiz.domain.student.Employee;
import tr.edu.yildiz.domain.student.Salary;

import java.util.Date;
import java.util.List;

public interface SalaryDao extends BaseDao<Salary>{

    int sumAmount(int amount);

    void updatePaymentDate(Date paymentDate ,Date newPaymentDate);

    List<Salary> payroll(Employee employee);

}
