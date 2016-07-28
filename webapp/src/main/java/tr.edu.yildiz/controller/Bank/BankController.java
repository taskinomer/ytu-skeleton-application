package tr.edu.yildiz.controller.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.domain.payment.bank.CardFamily;
import tr.edu.yildiz.service.Bank.BankService;
import tr.edu.yildiz.service.request.BankServiceRequest;
import tr.edu.yildiz.service.response.BankServiceResponse;

import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Bank> banks() {
        return bankService.findAll();
    }

    @RequestMapping("/{bankId}/cardFamily")
    @ResponseBody
    public List<CardFamily> getCardFamiliesByBankId(@PathVariable Integer bankId) {
        return bankService.getCardFamiliesByBankId(bankId);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void bankSave(@RequestBody BankServiceRequest bankServiceRequest){
        bankService.save(bankServiceRequest);


        //Duruma göre fonksiyon tipi BankServiceResponse olacak.
    }
}
