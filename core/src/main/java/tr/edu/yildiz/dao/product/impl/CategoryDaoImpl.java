package tr.edu.yildiz.dao.product.impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.product.CategoryDao;
import tr.edu.yildiz.domain.product.Category;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {
}
