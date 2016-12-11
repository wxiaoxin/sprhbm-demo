package com.xx.sprhbm.demo.dao.impl;

import com.sun.tools.javac.util.List;
import com.xx.sprhbm.demo.base.BaseDao;
import com.xx.sprhbm.demo.dao.IMenuDao;
import com.xx.sprhbm.demo.entity.Menu;
import org.hibernate.Session;

/**
 * Created by wxiao on 2016/12/11.
 */
public class MenuDao extends BaseDao implements IMenuDao {

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Menu menu) {
        this.getCurrentSession().save(menu);
    }

    @Override
    public void delete(String id) {
        this.getCurrentSession().delete(id);
    }

    @Override
    public void update(Menu menu) {

    }

    @Override
    public Menu get(String id) {
        return null;
    }

    @Override
    public List<Menu> list() {
        return null;
    }
}
