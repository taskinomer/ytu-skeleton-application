package tr.edu.yildiz.dao.payment.bank;


import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

public interface BankDao extends BaseDao<Bank> {

    @Override
    void save(Bank bank);

    void saveAll(Bank bank, CardFamily cardFamily, BinNumber binNumber);

    List<Bank> banks(Integer binNumberId);

    List<CardFamily> getCardFamiliesByBankId(Integer bankId);

}
