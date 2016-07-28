package tr.edu.yildiz.service.Bank;

import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.service.request.BinNumberSaveRequest;
import tr.edu.yildiz.service.response.BinNumberSaveResponse;

import java.util.List;

public interface BinNumberService {

    List<BinNumber> binNumbers();

    BinNumberSaveResponse save(BinNumberSaveRequest binNumberSaveRequest);
}


