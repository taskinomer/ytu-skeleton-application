package tr.edu.yildiz.dao.impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.CategoryDao;
import tr.edu.yildiz.domain.Category;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {
}
