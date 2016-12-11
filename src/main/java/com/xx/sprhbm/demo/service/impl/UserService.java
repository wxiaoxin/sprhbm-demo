package com.xx.sprhbm.demo.service.impl;


import com.xx.sprhbm.demo.dao.IUserDao;
import com.xx.sprhbm.demo.entity.User;
import com.xx.sprhbm.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wxiao on 2016/12/11.
 */

@Service
public class UserService implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User get(String id) {
        return userDao.get(id);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }


}
