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
     * 状态：1-正常 0-禁用 9-删除
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}
