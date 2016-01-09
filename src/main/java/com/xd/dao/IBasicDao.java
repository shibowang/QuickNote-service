package com.xd.dao;

import com.xd.entity.BasicEntity;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

/**
 * Created by XD on 2016/1/9.
 */
public interface IBasicDao<T extends BasicEntity> {
    Class classOfT();
    T get(Long id);
    List<T> getAll();
    Long save(T t);
    void update(T t);
    void saveOrUpdate(T t);
    void delete(Long id);
    void delete(T t);
    int count(DetachedCriteria dc);
    List<T> search(DetachedCriteria dc);
    List<T> search(DetachedCriteria dc,Integer start,Integer end);
    List<T> get(Integer start,Integer size);

    Query createQuery(String hql);

    SQLQuery createSQLQuery(String sql);
}
