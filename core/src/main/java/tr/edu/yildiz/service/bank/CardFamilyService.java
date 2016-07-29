package tr.edu.yildiz.service.bank;

import org.springframework.stereotype.Service;
import tr.edu.yildiz.service.request.CardFamilyRequest;
import tr.edu.yildiz.service.response.CardFamilyResponse;

@Service
public interface CardFamilyService {

    CardFamilyResponse cardFamilyResponse(CardFamilyRequest cardFamilyRequest, Integer bankId);
}
