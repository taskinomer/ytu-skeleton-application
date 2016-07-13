package tr.edu.yildiz.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.BrandDao;
import tr.edu.yildiz.domain.Brand;

import java.util.List;

@Repository
@Transactional
public class BrandDaoImpl extends BaseDaoImpl<Brand> implements BrandDao {

    @Override
    public List<Brand> findAll() {
        List<Brand> brands = getSessionFactory()
                .getCurrentSession()
                .createCriteria(Brand.class)
                .list();

        return brands;
    }

    @Override
    public Brand findById(Integer id) {
        List<Brand> brands = getSessionFactory()
                .getCurrentSession()
                .createCriteria(Brand.class)
                .add(Restrictions.eq("brandId", id))
                .list();

        if (brands.isEmpty()) {
            return null;
        }

        return brands.get(0);
    }

    @Override
    public void deleteById(Integer id) {
        Brand brand = findById(id);

        // null check
        if (brand != null) {
            getSessionFactory().getCurrentSession().delete(brand);
        }
    }

    @Override
    public void updateByName(String name, String newName) {

        List<Brand> brands = getSessionFactory()
                .getCurrentSession()
                .createCriteria(Brand.class)
                .add(Restrictions.eq("brandName", name))
                .list();

        for (Brand brand : brands) {
            brand.setBrandName(newName);
            getSessionFactory().getCurrentSession().saveOrUpdate(brand);
        }


    }

    @Override
    public Brand save(Brand brand) {
        getSessionFactory().getCurrentSession().save(brand);

        return brand;
    }
}
