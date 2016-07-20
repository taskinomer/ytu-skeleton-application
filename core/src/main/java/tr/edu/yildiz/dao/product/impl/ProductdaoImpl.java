package tr.edu.yildiz.dao.product.impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.product.ProductDao;
import tr.edu.yildiz.domain.product.Product;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ProductdaoImpl extends BaseDaoImpl<Product> implements ProductDao {
}
