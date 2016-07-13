package tr.edu.yildiz.dao;

import tr.edu.yildiz.domain.Brand;

import java.util.List;

public interface BrandDao extends BaseDao<Brand> {

    List<Brand> findAll();

    // find by id - integer

    Brand findById(Integer id);

    // delete by id - integer

    void deleteById(Integer id);

    // update by name string, string

    void updateByName(String name, String newName);


    Brand save(Brand brand);
}
