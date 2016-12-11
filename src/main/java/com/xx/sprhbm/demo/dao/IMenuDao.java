package com.xx.sprhbm.demo.dao;

import com.sun.tools.javac.util.List;
import com.xx.sprhbm.demo.entity.Menu;

/**
 * Created by wxiao on 2016/12/11.
 */
public interface IMenuDao {

    void save(Menu menu);

    void delete(String id);

    void update(Menu menu);

    Menu get(String id);

    List<Menu> list();

}
