package tr.edu.yildiz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import tr.edu.yildiz.dao.BrandDao;
import tr.edu.yildiz.domain.Brand;
import tr.edu.yildiz.service.BrandService;
import tr.edu.yildiz.service.input.BrandSaveRequest;
import tr.edu.yildiz.service.input.BrandUpdateRequest;

import java.util.List;

@Service

public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<Brand> find() {
        return brandDao.findAll();
    }

    @Override
    public Brand find(Integer id) {
        return brandDao.findById(id);
    }

    @Override
    public void deleteAll() {

        List<Brand> brands = brandDao.findAll();
        for (Brand brand : brands) {
            brandDao.deleteById(brand.getBrandId());
        }


    }

    @Override
    public Brand saveBrand(BrandSaveRequest brandSaveRequest) {
        Brand brand = new Brand();
        brand.setBrandName(brandSaveRequest.getBrandName());

        return brandDao.save(brand);
    }

    @Override
    public void updateBrand(BrandUpdateRequest brandUpdateRequest) {
        brandDao.updateByName(brandUpdateRequest.getOldName(), brandUpdateRequest.getNewName());
    }
}
