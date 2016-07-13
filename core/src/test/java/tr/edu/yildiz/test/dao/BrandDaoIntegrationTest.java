package tr.edu.yildiz.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.BrandDao;
import tr.edu.yildiz.domain.Brand;
import tr.edu.yildiz.test.GenericTest;

import java.util.List;

public class BrandDaoIntegrationTest extends GenericTest {

    @Autowired
    private BrandDao brandDao;


    @Test
    public void testFindAll() {
        String brandName = "test brand";
        createBrandWithName(brandName);


        List<Brand> brands = brandDao.findAll();

        Assert.assertEquals(brands.size(), 1);
        Assert.assertEquals(brands.get(0).getBrandName(), brandName);
    }

    @Test
    public void testSave() {
        String brandName = "omer";
        Brand brand = createBrandWithName(brandName);

        Brand savedBrand = brandDao.save(brand);

        Assert.assertNotNull(savedBrand);
        Assert.assertTrue(savedBrand.getBrandId() > 0);
        Assert.assertEquals(savedBrand.getBrandName(), brand.getBrandName());
    }

    private Brand createBrandWithName(String brandName) {
        Brand brand = new Brand();
        brand.setBrandName(brandName);

        return brandDao.save(brand);
    }

    @Test
    public void testUpdate() {


        // kayit olustur
        // omer le olustur
        String brandName = "ömer";
        Brand brandWithName = createBrandWithName(brandName);


        // update et - cengiz olarak
        // test edilecek method cagır
        String newBrandName = "cengiz";
        brandDao.updateByName(brandName, newBrandName);


        Brand byId = brandDao.findById(brandWithName.getBrandId());
        Assert.assertEquals(byId.getBrandName(), newBrandName);
        // assertion
        // kontrol et omer -> cengiz
    }

    @Test
    public void testDelete() {
        String brandName = "aaa";
        Brand brand = createBrandWithName(brandName);

        Brand saveBrand = brandDao.save(brand);
        Integer id = saveBrand.getBrandId();
        brandDao.deleteById(id);

        Brand foundBrand = brandDao.findById(id);
        Assert.assertNull(foundBrand);
    }

}
