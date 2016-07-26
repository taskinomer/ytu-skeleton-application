package tr.edu.yildiz.service.Bank;

import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;

import java.util.List;

public interface BankService {

    List<Bank> findAll();

    List<CardFamily> getCardFamiliesByBankId(Integer bankId);
}
