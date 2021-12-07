package com.xzit.xxxy.hbms.common.page;

import com.alibaba.druid.util.StringUtils;

public class PageDomain {
    /** 当前记录起始索引 */
    private Integer pageNum;
    /** 每页显示记录数 */
    private Integer pageSize;
    /** 排序列 */
    private String orderByColumn;
    /** 排序的方向 "desc" 或者 "asc". */
    private String isAsc;

    public PageDomain(){}
    public PageDomain(Integer pageNum, Integer pageSize, String orderByColumn, String isAsc) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
        this.isAsc = isAsc;
    }

    public String getOrderBy(){
        if (StringUtils.isEmpty(orderByColumn)){
            return "";
        }
        return orderByColumn + " " + isAsc;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    //getter/setter方法省略

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
