package tr.edu.yildiz.controller.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.dao.payment.bank.BinNumberDao;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.request.BinNumberSaveRequest;
import tr.edu.yildiz.service.bank.BinNumberService;
import tr.edu.yildiz.service.response.BinNumberResponse;

import java.util.List;

@Controller
@RequestMapping("/bin_number")
public class BinNumberController {

    @Autowired
    private BinNumberService binNumberService;

    @Autowired
    private BinNumberDao binNumberDao;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<BinNumber> binNumbers() {
        return binNumberService.binNumbers();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public BinNumberResponse saveBinNumber(@RequestBody BinNumberSaveRequest binNumberSaveRequest) {

        return binNumberService.save(binNumberSaveRequest);
    }


    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public BinNumberResponse deleteBinNumber(@RequestParam String binNumber) {
        BinNumberResponse binNumberResponse = new BinNumberResponse();
                try {
                    binNumberService.deleteBinNumber(binNumber);
                }catch(Exception e){
                    binNumberResponse.setSucceed(false);
                    binNumberResponse.setMessage(e.getMessage());
                }

        return binNumberResponse;
    }
}
