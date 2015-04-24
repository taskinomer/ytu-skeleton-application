package tr.edu.yildiz.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.BaseDao;

import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> type;

    protected BaseDaoImpl() {
        this.type =  (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(type).list();
    }

    @Override
    public void saveOrUpdate(T t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
