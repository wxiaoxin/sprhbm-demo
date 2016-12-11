package com.xx.sprhbm.demo.base;

import java.util.List;

/**
 * Created by wxiao on 2016/12/11.
 */
public class Page<T> {

    // 当前页数，默认第一页
    private int pageNo = 1;

    // 分页记录条数，默认15条数据
    private int pageSize = 15;

    // 总记录条数
    private int total;

    // 总页数
    private int pageCount;

    // 记录集合
    private List<T> data;

    public Page() {}

    public Page(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    /**
     * 获取查询起始索引
     * @return
     */
    public int getBeginIndex() {
        return (pageNo - 1) * pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

