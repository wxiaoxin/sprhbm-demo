package com.xx.sprhbm.demo.service.impl;

import com.xx.sprhbm.demo.BaseTest;
import com.xx.sprhbm.demo.base.Page;
import com.xx.sprhbm.demo.entity.Menu;
import com.xx.sprhbm.demo.service.IMenuService;
import com.xx.sprhbm.demo.util.CommonUtils;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by wxiao on 2016/12/12.
 */
public class MenuServiceTest extends BaseTest {
    
    @Resource
    private IMenuService menuService;
    
    
    @Test
    public void save() throws Exception {
        Menu parent = menuService.get("c3af308a87b243ee99c32af6233043ee");
        
        Menu menu = new Menu();
        menu.setId(CommonUtils.randomUUID());
        menu.setName("订单详情");
        menu.setUrl("/orders/:id?");
        menu.setCode("2005");
        menu.setStatus(1);
        menu.setSort(5);
        menu.setParentMenu(parent);
        
        menuService.save(menu);
    }

    @Test
    public void get() throws Exception {
        String id = "d6025e5e104c4e4fbb2227e7d4c20768";
        Menu menu = menuService.get(id);
        System.out.println(menu.getParentMenu().getName());
    }

    @Test
    public void list() throws Exception {
        Page<Menu> list = menuService.list(new Page<Menu>());
        System.out.println(list.getData().size());
    }

}