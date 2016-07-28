package tr.edu.yildiz.service.bank.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import tr.edu.yildiz.dao.payment.bank.BinNumberDao;
import tr.edu.yildiz.dao.payment.bank.CardFamilyDao;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.bank.BinNumberService;
import tr.edu.yildiz.service.request.BinNumberSaveRequest;
import tr.edu.yildiz.service.response.BinNumberSaveResponse;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BinNumberServiceImpl implements BinNumberService {

    @Autowired
    private BinNumberDao binNumberDao;

    @Autowired
    private CardFamilyDao cardFamilyDao;

    @Override
    public List<BinNumber> binNumbers() {
        return binNumberDao.binNumbers();
    }

    @Override
    public BinNumberSaveResponse save(BinNumberSaveRequest binNumberSaveRequest) {
        BinNumberSaveResponse response = new BinNumberSaveResponse();

        try {
            processSave(binNumberSaveRequest, response);
        } catch (Exception e) {
            response.setSucceed(false);
            response.setMessage(e.getMessage());
        }

        return response;
    }

    private void processSave(BinNumberSaveRequest binNumberSaveRequest, BinNumberSaveResponse response) throws Exception {
        validateRequestParameters(binNumberSaveRequest);

        validateCardFamilyAndSaveBin(binNumberSaveRequest, response);
    }

    private void validateCardFamilyAndSaveBin(BinNumberSaveRequest binNumberSaveRequest, BinNumberSaveResponse response) throws Exception {
        List<CardFamily> cardFamilies = cardFamilyDao.findByCardFamilyId(binNumberSaveRequest.getCardFamilyId());
        if (cardFamilies.isEmpty()) {
            throw new Exception("card family does not exists");
        }

        CardFamily cardFamily = cardFamilies.get(0);

        List<BinNumber> binNumbers = binNumberDao.findBinNumberByCardFamilyAndBinNumber(cardFamily, binNumberSaveRequest.getBin());
        if (!binNumbers.isEmpty()) {
            throw new Exception("bin number already exists");
        }

        saveBinNumber(binNumberSaveRequest, cardFamily);
        response.setSucceed(true);
    }

    private void saveBinNumber(BinNumberSaveRequest binNumberSaveRequest, CardFamily cardFamily) {
        BinNumber binNumber = new BinNumber();
        binNumber.setCardFamily(cardFamily);
        binNumber.setBin(binNumberSaveRequest.getBin());
        binNumber.setInsertDate(new Date());
        binNumberDao.save(binNumber);
    }

    private void validateRequestParameters(BinNumberSaveRequest binNumberSaveRequest) throws Exception {
        if (StringUtils.isEmpty(binNumberSaveRequest.getBin())) {
            throw new Exception("bin numarasi valid degil");
        }

        if (binNumberSaveRequest.getCardFamilyId() == null || binNumberSaveRequest.getCardFamilyId() < 1) {
            throw new Exception("kart ailesi valid degil");
        }
    }

}
