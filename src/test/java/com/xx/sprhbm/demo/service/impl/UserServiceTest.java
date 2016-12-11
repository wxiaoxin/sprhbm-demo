package com.xx.sprhbm.demo.service.impl;

import com.xx.sprhbm.demo.BaseTest;
import com.xx.sprhbm.demo.entity.User;
import com.xx.sprhbm.demo.service.IUserService;
import com.xx.sprhbm.demo.util.CommonUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wxiao on 2016/12/11.
 */
public class UserServiceTest extends BaseTest {


    @Autowired
    private IUserService userService;

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setId(CommonUtils.randomUUID());
        user.setName("admin");
        user.setPwd("123456");
        user.setStatus(1);

        userService.save(user);
    }

    @Test
    public void get() throws Exception {
        User user = userService.get("76037a4578b34653bf6b475fe9db4c5f");
        if(user != null) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void delete() {
        userService.delete("473d2f1e0804433fa353d51d3f42ae07");
    }

}