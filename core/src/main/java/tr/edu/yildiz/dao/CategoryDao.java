package tr.edu.yildiz.dao;

import tr.edu.yildiz.domain.Category;

import java.util.List;

public interface CategoryDao extends BaseDao<Category> {


    // TODO
    // find - sortNum a gore asc (artan) sirali gelsin
    // method parametre alsin - limit
    // List<Category> findCategoriesOrderedBySortNumWithLimit(Integer limit);
}

