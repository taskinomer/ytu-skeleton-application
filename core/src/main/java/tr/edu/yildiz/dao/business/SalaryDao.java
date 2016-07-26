package tr.edu.yildiz.dao.business;

import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.business.Employee;
import tr.edu.yildiz.domain.business.Salary;

import java.util.Date;
import java.util.List;

public interface SalaryDao extends BaseDao<Salary>{
    public int sumAmount(int amount);
    public void updatePaymentDate(Date paymentDate, Date newPaymentDate);
    public List<Salary> payroll(Employee employee);
}
