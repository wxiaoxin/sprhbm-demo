package com.xx.sprhbm.demo.dao;

import com.xx.sprhbm.demo.base.Page;
import com.xx.sprhbm.demo.entity.Menu;

import java.util.List;

/**
 * Created by wxiao on 2016/12/11.
 */
public interface IMenuDao {

    void save(Menu menu);

    void delete(String id);

    void update(Menu menu);

    Menu get(String id);

    Page<Menu> list(Page<Menu> page);

}
