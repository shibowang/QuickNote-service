package com.xd.dao.impl;

import com.xd.dao.IBasicDao;
import com.xd.entity.BasicEntity;
import org.hibernate.*;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.MappedSuperclass;
import java.util.List;

/**
 * Created by XD on 2016/1/9.
 */
@MappedSuperclass
public abstract class BasicDao<T extends BasicEntity> implements IBasicDao<T> {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected String getClassName() {
        return classOfT().getName().substring(classOfT().getName().lastIndexOf(".") + 1);
    }
    @Override
    public T get(Long id){
        return (T) getSession().get(classOfT(),id);
    }


    @Override
    public List<T> getAll() {
        return createQuery("from " + getClassName()).list();
    }

    @Override
    public Long save(T t) {
        t.setCreated_time(System.currentTimeMillis());
        t.setModify_time(System.currentTimeMillis());
        return (Long)getSession().save(t);
    }

    @Override
    public void update(T t) {
        t.setModify_time(System.currentTimeMillis());
        getSession().update(t);
    }

    @Override
    public void saveOrUpdate(T t) {
        t.setModify_time(System.currentTimeMillis());
        getSession().saveOrUpdate(t);
    }

    @Override
    public void delete(Long id) {
        getSession().delete(get(id));
    }

    @Override
    public void delete(T t) {
        getSession().delete(t);
    }
    @Override
    public int count(DetachedCriteria dc) {
        Criteria c = dc.getExecutableCriteria(getSession()).setProjection(Projections.rowCount());
        return (Integer)c.uniqueResult();
    }
    @Override
    public List<T> search(DetachedCriteria dc) {
        return search(dc,null,null);
    }
    @Override
    public List<T> search(DetachedCriteria dc, Integer start, Integer size) {
        dc.setResultTransformer(DetachedCriteria.DISTINCT_ROOT_ENTITY);
        Criteria c = dc.getExecutableCriteria(getSession());
        if (start != null) {
            c.setFirstResult(start);
        }

        if (size != null) {
            c.setMaxResults(size);
        }

        return c.list();
    }
    @Override
    public List<T> get(Integer start, Integer size) {
        return createQuery("from " + getClassName())
                .setFirstResult(start)
                .setMaxResults(size)
                .list();
    }

    @Override
    public Query createQuery(String hql) {
        return getSession().createQuery(hql);
    }

    @Override
    public SQLQuery createSQLQuery(String sql) {
        return getSession().createSQLQuery(sql);
    }
}
