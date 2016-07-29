package tr.edu.yildiz.dao.payment.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.payment.bank.BinNumberDao;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

@Repository
@Transactional
public class BinNumberDaoImpl extends BaseDaoImpl<BinNumber> implements BinNumberDao {

    @Override
    public List<BinNumber> binNumbers() {
        return getSessionFactory().getCurrentSession().createQuery("SELECT e FROM BinNumber e").list();
    }

    @Override
    public List<BinNumber> findBinNumberByCardFamilyAndBinNumber(CardFamily cardFamily, String bin) {
        return getSessionFactory().getCurrentSession().createQuery("select b from BinNumber b where b.cardFamily = :cardFamily and b.bin = :bin")
                .setParameter("cardFamily", cardFamily)
                .setParameter("bin", bin)
                .list();
    }

    @Override
    public void save(BinNumber binNumber) {
        sessionFactory.getCurrentSession().save(binNumber);
    }

    @Override
    public void delete(String binNumber) {
        getSessionFactory().getCurrentSession().createQuery("delete FROM BinNumber where binNumber= :binNumber")
                .setParameter("binNumber", binNumber);
    }

}
