package com.xx.sprhbm.demo.ctrl;

import com.xx.sprhbm.demo.entity.User;
import com.xx.sprhbm.demo.service.IUserService;
import com.xx.sprhbm.demo.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by wxiao on 2016/12/11.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String save() {

        User user = new User();
        user.setId(CommonUtils.randomUUID());
        user.setName("admin");
        user.setPwd("123456");
        user.setStatus(1);

        userService.save(user);

        return "success";
    }

}
