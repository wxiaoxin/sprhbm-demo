package com.xx.sprhbm.demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wxiao on 2016/12/11.
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    private String index() {
        return "index";
    }

}
