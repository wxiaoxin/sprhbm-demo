package com.xx.sprhbm.demo.service;

import com.xx.sprhbm.demo.base.Page;
import com.xx.sprhbm.demo.entity.Menu;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wxiao on 2016/12/12.
 * 
 * 菜单服务
 */

public interface IMenuService {
    
    @Transactional
    void save(Menu menu);
    
    @Transactional
    Menu get(String id);
    
    @Transactional
    Page<Menu> list(Page<Menu> page);
    
}
