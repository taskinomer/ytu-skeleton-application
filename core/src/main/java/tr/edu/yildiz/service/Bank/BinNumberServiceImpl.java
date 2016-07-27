package tr.edu.yildiz.service.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.payment.bank.BinNumberDao;
import tr.edu.yildiz.domain.payment.bank.BinNumber;

import java.util.List;

@Service
@Transactional
public class BinNumberServiceImpl implements BinNumberService {

    @Autowired
    private BinNumberDao binNumber;

    @Override
    public List<BinNumber> binNumbers() {
        return binNumber.binNumbers();
    }
}
