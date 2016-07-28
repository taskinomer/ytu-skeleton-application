package tr.edu.yildiz.service.bank;

import tr.edu.yildiz.domain.dto.bank.BankDto;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.request.BankServiceRequest;

import java.util.List;

public interface BankService {

    List<BankDto> findAll();

    List<CardFamily> getCardFamiliesByBankId(Integer bankId);

    void save(BankServiceRequest bankServiceRequest);


}
