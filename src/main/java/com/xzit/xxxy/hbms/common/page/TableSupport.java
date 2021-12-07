package com.xzit.xxxy.hbms.common.page;

import com.xzit.xxxy.hbms.common.utils.ServletUtils;

/**
 * 表格数据处理
 */
public class TableSupport {
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain() {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt("pageNum"));
        pageDomain.setPageSize(ServletUtils.getParameterToInt("pageSize"));
        pageDomain.setOrderByColumn(ServletUtils.getParameter("orderByColumn"));
        pageDomain.setIsAsc(ServletUtils.getParameter("isAsc"));
        return pageDomain;
    }

    public static PageDomain buildPageRequest(){
        //接收表格传递数据
        return getPageDomain();
    }

}
