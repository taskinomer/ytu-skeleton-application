package tr.edu.yildiz.dao.payment.Impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.Date;
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

    @Override
    public List<CardFamily> getCardFamiliesByBankId(Integer bankId) {
        return getSessionFactory().getCurrentSession().createQuery("select c from cardFamily c WHERE c.bank.bankId = :bankId")
                .setParameter("bankId", bankId).list();
    }

    @Override
    public List<Bank> findByBankId(Integer bankId) {
        return getSessionFactory().getCurrentSession().createQuery("select b from Bank b where b.bankId= :bankId")
                .setParameter("bankId", bankId).list();
    }

    @Override
    public List<Bank> updateBankByBankId(Integer bankId,String newName) {
         getSessionFactory().getCurrentSession().createQuery("UPDATE Bank set name = :newName, updateDate = :updateDate where bankId= :bankId")
                .setParameter("bankId",bankId)
                .setParameter("newName",newName)
                .setParameter("updateDate", new Date());

        return getSessionFactory().getCurrentSession().createQuery("SELECT b from Bank b Where bankId= :bankId")
                .setParameter("bankId", bankId).list();
    }


}
