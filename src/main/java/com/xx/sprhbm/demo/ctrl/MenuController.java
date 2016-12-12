package com.xx.sprhbm.demo.ctrl;

import com.xx.sprhbm.demo.base.BaseController;
import com.xx.sprhbm.demo.base.Page;
import com.xx.sprhbm.demo.entity.Menu;
import com.xx.sprhbm.demo.service.IMenuService;
import com.xx.sprhbm.demo.util.CommonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wxiao on 2016/12/11.
 */

@Controller
@RequestMapping("/menus")
public class MenuController extends BaseController {

    @Resource
    private IMenuService menuService;

    /**
     * 新增菜单对象
     * @param menu
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    private String menus(Menu menu, HttpServletRequest request) {
        System.out.println(request.getParameterMap());
        menu.setId(CommonUtils.randomUUID());
        menuService.save(menu);
        return success();
    }

    /**
     * 获取菜单列表
     * @param page
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String list(Page<Menu> page) {
        Page<Menu> resultPage = menuService.list(page);
        return success(resultPage);
    }

    /**
     * 获取指定id的菜单对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable String id) {
        Menu menu = menuService.get(id);
        return success(menu);
    }

}
