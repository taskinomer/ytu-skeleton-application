package tr.edu.yildiz.controller.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tr.edu.yildiz.service.bank.CardFamilyService;
import tr.edu.yildiz.service.request.CardFamilyRequest;
import tr.edu.yildiz.service.response.CardFamilyResponse;

@Controller
@RequestMapping("/cardFamily")
public class CardFamilyController {

    @Autowired
    private CardFamilyService cardFamilyService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public CardFamilyResponse cardFamilyResponse(@RequestBody CardFamilyRequest cardFamilyRequest, @PathVariable Integer bankId) {
        CardFamilyResponse cardFamilyResponse = new CardFamilyResponse();


        cardFamilyService.cardFamilyResponse(cardFamilyRequest, bankId);

        return  cardFamilyResponse;
    }


}
