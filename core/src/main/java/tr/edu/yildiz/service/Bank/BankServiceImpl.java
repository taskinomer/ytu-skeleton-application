package tr.edu.yildiz.service.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankDao bankDao;

    @Override
    public List<Bank> findAll() {
        return bankDao.findAll();
    }

    @Override
    public List<CardFamily> getCardFamiliesByBankId(Integer id) {

        return null;
    }
}
