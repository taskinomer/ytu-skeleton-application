package tr.edu.yildiz.controller.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.domain.dto.bank.BankDto;
import org.springframework.web.bind.annotation.*;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.bank.BankService;
import tr.edu.yildiz.service.request.BankServiceRequest;

import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<BankDto> banks() {
        return bankService.findAll();
    }

    @RequestMapping("/{bankId}/cardFamily")
    @ResponseBody
    public List<CardFamily> getCardFamiliesByBankId(@PathVariable Integer bankId) {
        return bankService.getCardFamiliesByBankId(bankId);

    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void bankSave(BankServiceRequest bankServiceRequest) {
        bankService.save(bankServiceRequest);
    }

    @RequestMapping(value = "/{bankId}", method = RequestMethod.PUT)
    @ResponseBody
    public List<Bank> updateBankNameByBankId(@PathVariable Integer bankId, @RequestParam String newName) {
        return bankService.updateBankNameByBankId(bankId,newName);}
}
