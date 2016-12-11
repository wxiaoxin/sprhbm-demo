package com.xx.sprhbm.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wxiao on 2016/12/11.
 *
 * 菜单
 */

@Entity
public class Menu {

    @Id
    @Column(columnDefinition = "char(32)", updatable = false)
    private String id;

    /**
     * 菜单名称
     */
    @Column(length = 10)
    private String name;

    /**
     * 菜单地址
     */
    private String url;

    /**
     * 菜单编码
     */
    @Column(length = 6)
    private String code;

    /**
     * 排序
     */
    @Column(length = 3)
    private int sort;

    /**
     * 状态：1-正常 9-删除
     */
    @Column(columnDefinition = "smallint(3)")
    private int status;

    /**
     * 父级菜单：
     * 如果是一级菜单则该列为NULL，否则为父级菜单的主键id
     */
    @ManyToOne
    @JoinColumn(name = "p_id")
    private Menu parentMenu;

    @CreationTimestamp
    @Column(name = "create_timestamp")
    private Date createTimestamp;

    @UpdateTimestamp
    @Column(name = "update_timestamp")
    private Date updateTimestamp;

    public Menu() {
    }




}
