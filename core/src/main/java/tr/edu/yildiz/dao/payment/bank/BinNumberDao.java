package tr.edu.yildiz.dao.payment.bank;


import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

public interface BinNumberDao extends BaseDao<BinNumber> {
    @Override
    void save(BinNumber binNumber);

    List<BinNumber> binNumbers();

    List<BinNumber> findBinNumberByCardFamilyAndBinNumber(CardFamily cardFamily, String bin);

    void delete (String binNumber);
}
