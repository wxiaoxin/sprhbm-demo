package com.xx.sprhbm.demo.service.impl;

import com.xx.sprhbm.demo.base.Page;
import com.xx.sprhbm.demo.dao.IMenuDao;
import com.xx.sprhbm.demo.entity.Menu;
import com.xx.sprhbm.demo.service.IMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wxiao on 2016/12/12.
 */

@Service
public class MenuService implements IMenuService {
    
    @Resource
    private IMenuDao menuDao;
    
    @Override
    public void save(Menu menu) {
        menuDao.save(menu);
    }

    @Override
    public Menu get(String id) {
        return menuDao.get(id);
    }

    @Override
    public Page<Menu> list(Page<Menu> page) {
        return menuDao.list(page);
    }
}
