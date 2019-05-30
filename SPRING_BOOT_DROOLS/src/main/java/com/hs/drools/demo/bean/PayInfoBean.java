package com.hs.drools.demo.bean;

import com.hs.drools.demo.base.BaseBean;

import java.math.BigDecimal;
import java.sql.Date;

public class PayInfoBean extends BaseBean{

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 付款人ID
     */
    private Integer userId;

    /**
     * 付款金额
     */
    private BigDecimal cashAmount;

    /**
     * 付款状态
     */
    private Integer status;

    /**
     * 付款类型
     */
    private Integer type;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 创建日期
     */
    private Date gmtCreate;

    /**
     * 更新日期
     */
    private Date gmtUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Override
    public String toString() {
        return "PayInfoBean{" +
                "id=" + id +
                ", userId=" + userId +
                ", cashAmount=" + cashAmount +
                ", status=" + status +
                ", type=" + type +
                ", productId=" + productId +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }

}
