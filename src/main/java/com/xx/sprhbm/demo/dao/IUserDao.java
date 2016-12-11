package com.xx.sprhbm.demo.dao;

import com.xx.sprhbm.demo.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wxiao on 2016/12/11.
 */

public interface IUserDao {

    void save(User user);

    User get(String id);

    void delete(String id);

}
