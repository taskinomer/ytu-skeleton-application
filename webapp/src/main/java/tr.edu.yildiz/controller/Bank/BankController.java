package tr.edu.yildiz.controller.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.Bank.BankService;

import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @RequestMapping(method = {RequestMethod.GET})
    @ResponseBody
    public List<Bank> banks() {
        return bankService.findAll();
    }

    @RequestMapping("/{bankId}/cardFamily")
    @ResponseBody
    public List<CardFamily> getCardFamiliesByBankId(@PathVariable Integer bankId) {
        return bankService.getCardFamiliesByBankId(bankId);
    }
}
