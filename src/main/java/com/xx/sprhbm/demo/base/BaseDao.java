package com.xx.sprhbm.demo.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wxiao on 2016/12/11.
 */
public class BaseDao {

    @Resource
    protected SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(Object obj) {
        this.getCurrentSession().save(obj);
    }

    public <T> void del(Class<T> T, String id) {
        String hql = "DELETE FROM " + T.getName() + " WHERE id = '" + id + "'";
        Query query = this.getCurrentSession().createQuery(hql);
        query.executeUpdate();
    }

    public <T> void delete(Class<T> T, String id) {
        String hql = "UPDATE " + T.getName() + " SET status = 9 WHERE id = '" + id + "'";
        Query query = this.getCurrentSession().createQuery(hql);
        query.executeUpdate();
    }

    public void update(Object obj) {
        this.getCurrentSession().update(obj);
    }

    protected <T> T get(Class<T> clz, String id) {
        return this.getCurrentSession().get(clz, id);
    }

    protected <T> T getByHQL(String hql, Class<T> clz) {
        Query<T> query = this.getCurrentSession().createQuery(hql, clz);
        return query.uniqueResult();
    }

    protected <T> List<T> listByHQL(String hql, Class<T> clz) {
        Query<T> query = this.getCurrentSession().createQuery(hql, clz);
        return query.list();
    }

    protected <T> Page<T> listByHQL(String hql, Page<T> page, Class<T> clz) {
        Query<T> query = this.getCurrentSession().createQuery(hql, clz);
        page.setTotal(query.list().size());
        query.setFirstResult(page.getBeginIndex());
        query.setMaxResults(page.getPageSize());
        page.setData(query.list());
        return page;
    }


}
