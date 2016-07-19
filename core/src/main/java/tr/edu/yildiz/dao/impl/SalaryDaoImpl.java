package tr.edu.yildiz.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.SalerDao;
import tr.edu.yildiz.domain.student.Saler;

@Repository
@Transactional
public class SalerDaoImpl extends BaseDaoImpl<Saler> implements SalerDao{

}
