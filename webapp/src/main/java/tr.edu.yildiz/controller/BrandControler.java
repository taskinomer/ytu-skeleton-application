package tr.edu.yildiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tr.edu.yildiz.domain.Brand;
import tr.edu.yildiz.service.BrandService;
import tr.edu.yildiz.service.input.BrandSaveRequest;
import tr.edu.yildiz.service.input.BrandUpdateRequest;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class BrandControler {

    @Autowired
    public BrandService brandService;

    @RequestMapping
    @ResponseBody
    public List<Brand> getAllBrands() {
        return brandService.find();
    }

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public Brand getBrand(@PathVariable Integer id) {
        return brandService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Brand saveBrand(@RequestBody BrandSaveRequest brandSaveRequest) {
        return brandService.saveBrand(brandSaveRequest);
    }

    @RequestMapping(value = "/{d}/{a}",method = RequestMethod.PUT)
    @ResponseBody
    public void updateBrand(@PathVariable(value = "d") Integer id,
                            @PathVariable(value = "a") Integer yeni,
                            BrandSaveRequest brandSaveRequest,
                            @RequestBody BrandUpdateRequest brandUpdateRequest) {
        brandService.updateBrand(brandUpdateRequest);
    }

    @RequestMapping(value = "/{d}/{a}",method = RequestMethod.PUT)
    public String updateBrand(@PathVariable(value = "d") Integer id,
                            @PathVariable(value = "a") Integer yeni,
                            BrandSaveRequest brandSaveRequest,
                              @ModelAttribute Hello hello,
                            @RequestBody BrandUpdateRequest brandUpdateRequest) {
        brandService.updateBrand(brandUpdateRequest);
        hello.setTitle("sdfs");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteBrand() {
        brandService.deleteAll();
    }
}
