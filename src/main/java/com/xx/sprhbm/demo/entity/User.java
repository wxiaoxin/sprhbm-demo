package com.xx.sprhbm.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by wxiao on 2016/12/9.
 *
 * 用户
 */

@Entity
public class User {

    @Id
    @Column(columnDefinition = "char(32)", updatable = false)
    private String id;

    /**
     * 用户名
     */
    @Column(length = 32)
    private String name;

    /**
     * 密码
     */
    @Column(columnDefinition = "char(32)")
    private String pwd;

    /**
     * 状态：
     * 1-正常 0-禁用 9-删除
     */
    @Column(columnDefinition = "smallint(3)")
    private int status;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    public User() {}

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
