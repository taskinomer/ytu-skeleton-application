package tr.edu.yildiz.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();

    void saveOrUpdate(T t);
}
