package com.xx.sprhbm.demo.dao.impl;

import com.xx.sprhbm.demo.base.BaseDao;
import com.xx.sprhbm.demo.base.Page;
import com.xx.sprhbm.demo.dao.IMenuDao;
import com.xx.sprhbm.demo.entity.Menu;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wxiao on 2016/12/11.
 */

@Repository
public class MenuDao extends BaseDao implements IMenuDao {

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Menu menu) {
        super.save(menu);
    }

    @Override
    public void delete(String id) {
        super.delete(Menu.class, id);
    }

    @Override
    public void update(Menu menu) {
        super.update(menu);
    }

    @Override
    public Menu get(String id) {
        return super.get(Menu.class, id);
    }

    @Override
    public Page<Menu> list(Page<Menu> page) {
        return super.list(Menu.class, page);
    }
}
