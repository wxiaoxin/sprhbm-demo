package com.xx.sprhbm.demo.dao.impl;


import com.xx.sprhbm.demo.base.BaseDao;
import com.xx.sprhbm.demo.dao.IUserDao;
import com.xx.sprhbm.demo.entity.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * Created by wxiao on 2016/12/11.
 */

@Repository
public class UserDao extends BaseDao implements IUserDao {


//    private Session getCurrentSession() {
//        return sessionFactory.getCurrentSession();
//    }

    @Override
    public void save(User user) {
        super.save(user);
    }

    @Override
    public User get(String id) {
        return super.get(User.class, id);
    }

    @Override
    public void delete(String id) {
        super.delete(User.class, id);
    }


}
