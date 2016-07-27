package tr.edu.yildiz.controller.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.domain.payment.bank.BinNumber;
import tr.edu.yildiz.service.Bank.BinNumberService;

import java.util.List;

@Controller
@RequestMapping("/bin_number")
public class BinNumberController {

    @Autowired
    private BinNumberService binNumberService;

    @RequestMapping(method = {RequestMethod.GET})
    @ResponseBody
    public List<BinNumber> binNumbers() {
        return binNumberService.binNumbers();
    }

}
