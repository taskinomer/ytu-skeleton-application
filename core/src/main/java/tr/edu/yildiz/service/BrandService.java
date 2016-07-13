package tr.edu.yildiz.service;

import tr.edu.yildiz.domain.Brand;
import tr.edu.yildiz.service.input.BrandSaveRequest;
import tr.edu.yildiz.service.input.BrandUpdateRequest;

import java.util.List;

public interface BrandService {

    List<Brand> find();

    Brand find(Integer id);

    void deleteAll();

    Brand saveBrand(BrandSaveRequest brandSaveRequest);

    void updateBrand(BrandUpdateRequest brandUpdateRequest);
}
