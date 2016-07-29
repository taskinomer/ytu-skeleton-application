package tr.edu.yildiz.service.bank.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.bank.CardFamilyService;
import tr.edu.yildiz.service.request.CardFamilyRequest;
import tr.edu.yildiz.service.response.CardFamilyResponse;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CardFamilyServiceImpl implements CardFamilyService {

    @Autowired
    private BankDao bankDao;

    @Override
    public CardFamilyResponse cardFamilyResponse(CardFamilyRequest cardFamilyRequest, Integer bankId) {
        CardFamilyResponse response = new CardFamilyResponse();

        List<Bank> banks = bankDao.findByBankId(bankId);
        if (banks.isEmpty()) {
            return response;
        }

        else {
            CardFamily cardFamily = new CardFamily();

            cardFamily.setName(cardFamilyRequest.getName());
            cardFamily.setInsertDate(new Date());
            cardFamily.setCardFamilyType(cardFamilyRequest.getCardFamilyType());
            cardFamily.setMinChargeAmount(cardFamilyRequest.getMinChargeAmount());
            cardFamily.setThreeDEnable(cardFamilyRequest.getThreeDEnable());
            cardFamily.setUiLogoKey(cardFamilyRequest.getUiLogoKey());
        }

        return response;
    }
}

