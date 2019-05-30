package com.hs.drools.demo.base;

public class BaseBean {

    /**
     * 排序列及字段 如 user asc,name desc
     */
    private String order = " gmt_create desc ";

    /**
     * 页大小
     */
    private Integer pageSize = 10;
    /**
     * 第几页
     */
    private Integer page = 1;


    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "BaseDAO{" +
                "order='" + order + '\'' +
                ", pageSize=" + pageSize +
                ", page=" + page +
                '}';
    }

}
