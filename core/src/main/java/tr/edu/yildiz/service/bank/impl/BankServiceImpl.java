package tr.edu.yildiz.service.bank.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.dto.bank.BankDto;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.mapper.bank.BankToBankDto;
import tr.edu.yildiz.service.bank.BankService;
import tr.edu.yildiz.service.request.BankServiceRequest;

import java.util.List;

@Service
@Transactional
public class BankServiceImpl implements BankService {

    @Autowired
    private BankDao bankDao;

    @Override
    public List<BankDto> findAll() {
        List<Bank> all = bankDao.findAll();
        return BankToBankDto.map(all);
    }

    @Override
    public List<CardFamily> getCardFamiliesByBankId(Integer bankId) {

        return bankDao.getCardFamiliesByBankId(bankId);
    }

    public void save(BankServiceRequest bankServiceRequest) {

        Bank bank = new Bank();

        bank.setName(bankServiceRequest.getName());

        bankDao.save(bank);
    }

    @Override
    public List<Bank> update(Integer bankId, String newName) {

        return bankDao.updateBankByBankId(bankId,newName);

    }

}
