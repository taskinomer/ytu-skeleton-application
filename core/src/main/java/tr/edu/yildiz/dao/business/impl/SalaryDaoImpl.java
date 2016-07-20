package tr.edu.yildiz.dao.business.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.business.SalaryDao;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.domain.business.Employee;
import tr.edu.yildiz.domain.business.Salary;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public abstract class SalaryDaoImpl extends BaseDaoImpl<Salary> implements SalaryDao{


    @Override
    public int sumAmount(int amount) {
        getSessionFactory().getCurrentSession().createQuery("SELECT SUM(amount) FROM salary");
        return 0;
    }

    @Override
    public void updatePaymentDate(Date paymentDate, Date newPaymentDate) {

        getSessionFactory().getCurrentSession()
                .createQuery("update Salary e set e.paymentDate = :newPaymentDate where e.paymentDate = :paymentDate")
                .setParameter("paymentDate", paymentDate)
                .setParameter("newPaymentDate", newPaymentDate)
                .executeUpdate();

    }

    @Override
    public List<Salary> payroll(Employee employee) {
        return getSessionFactory().getCurrentSession().createQuery("SELECT e FROM Salary e"+
                " WHERE e.employee = :employee")
                .setParameter("employee",  employee)
                .list();

    }
}

