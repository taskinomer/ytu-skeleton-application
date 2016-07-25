package tr.edu.yildiz.dao.payment.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.payment.bank.BinNumberDao;
import tr.edu.yildiz.domain.payment.bank.BinNumber;

import java.util.List;

@Repository
@Transactional
public class BinNumberDaoImpl extends BaseDaoImpl<BinNumber> implements BinNumberDao {

    public List<BinNumber> binNumbers(){
        return getSessionFactory().getCurrentSession().createQuery("SELECT e FROM BinNumber e").list();
    }

    public void save(BinNumber binNumber){
        sessionFactory.getCurrentSession().save(binNumber);
    }
}
