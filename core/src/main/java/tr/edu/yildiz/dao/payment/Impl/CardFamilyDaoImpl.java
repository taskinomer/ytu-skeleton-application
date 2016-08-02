package tr.edu.yildiz.dao.payment.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.payment.bank.CardFamilyDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

@Repository
@Transactional
public class CardFamilyDaoImpl extends BaseDaoImpl<CardFamily> implements CardFamilyDao {

    public void save(CardFamily cardFamily) {
        sessionFactory.getCurrentSession().save(cardFamily);
    }

    public List<CardFamily> cardFamilies(Integer bankId) {
        return getSessionFactory().getCurrentSession().createQuery("select c from CardFamily c WHERE c.bank.bankId = :bankId")
                .setParameter("bankId", bankId).list();
    }

    public List<CardFamily> allCardFamilies() {
        return getSessionFactory().getCurrentSession().createQuery("SELECT cf from cardFamily cf").list();
    }

    @Override
    public List<CardFamily> findByCardFamilyId(Integer cardFamilyId) {
        return getSessionFactory().getCurrentSession().createQuery("select c from CardFamily c where c.cardFamilyId = :id ").setParameter("id", cardFamilyId).list();
    }
}
