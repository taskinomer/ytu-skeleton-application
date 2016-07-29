package tr.edu.yildiz.service.bank;

import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.service.request.BinNumberSaveRequest;
import tr.edu.yildiz.service.response.BinNumberResponse;

import java.util.List;

public interface BinNumberService {

    List<BinNumber> binNumbers();

    BinNumberResponse save(BinNumberSaveRequest binNumberSaveRequest);

    void deleteBinNumber(String binNumber);
}


