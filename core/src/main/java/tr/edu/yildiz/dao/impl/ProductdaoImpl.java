package tr.edu.yildiz.dao.impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.ProductDao;
import tr.edu.yildiz.domain.Product;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ProductdaoImpl extends BaseDaoImpl<Product> implements ProductDao {
}
