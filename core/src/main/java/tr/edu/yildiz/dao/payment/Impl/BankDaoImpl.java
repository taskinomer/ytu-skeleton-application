package tr.edu.yildiz.dao.payment.Impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;


@Repository
public class BankDaoImpl extends BaseDaoImpl<Bank> implements BankDao {

    @Override
    public void save(Bank bank) {
        sessionFactory.getCurrentSession().save(bank);
    }

    @Override
    public void saveAll(Bank bank, CardFamily cardFamily, BinNumber binNumber) {
        getSessionFactory().getCurrentSession().save(bank);
        getSessionFactory().getCurrentSession().save(cardFamily);
        getSessionFactory().getCurrentSession().save(binNumber);
    }

    @Override
    public List<Bank> banks(Integer X) {
        return getSessionFactory().getCurrentSession().createQuery("select b from Bank b " +
                "where b.bank.cardFamily.binNumberId = :X")
                .setParameter("X", X).list();
    }
}
