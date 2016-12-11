package com.xx.sprhbm.demo.service;

import com.xx.sprhbm.demo.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wxiao on 2016/12/11.
 */
public interface IUserService {

    @Transactional
    void save(User user);

    @Transactional
    User get(String id);

    @Transactional
    void delete(String id);

}
