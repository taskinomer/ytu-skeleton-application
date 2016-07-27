package tr.edu.yildiz.dao.payment.bank;

import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

public interface CardFamilyDao extends BaseDao<CardFamily> {
    @Override
    void save(CardFamily cardFamily);

    List<CardFamily> cardFamilies(Integer bankId);

    List<CardFamily> allCardFamilies();

    List<CardFamily> findByCardFamilyId(Integer cardFamilyId);
}
