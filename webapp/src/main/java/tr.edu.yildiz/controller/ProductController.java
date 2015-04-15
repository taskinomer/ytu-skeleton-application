package tr.edu.yildiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.result.ProductResponse;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/test")
    @ResponseBody
    public ProductResponse test() {
        ProductResponse productResponse = new ProductResponse();

        return productResponse;
    }
}
