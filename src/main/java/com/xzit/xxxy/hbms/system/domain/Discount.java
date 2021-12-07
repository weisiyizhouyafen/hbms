package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Discount implements Serializable {
    private Integer discountId;

    private String disMes;

    private Date disRelease;

    private Date disDeadline;

    private String disSta;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public String getDisMes() {
        return disMes;
    }

    public void setDisMes(String disMes) {
        this.disMes = disMes;
    }

    public Date getDisRelease() {
        return disRelease;
    }

    public void setDisRelease(Date disRelease) {
        this.disRelease = disRelease;
    }

    public Date getDisDeadline() {
        return disDeadline;
    }

    public void setDisDeadline(Date disDeadline) {
        this.disDeadline = disDeadline;
    }

    public String getDisSta() {
        return disSta;
    }

    public void setDisSta(String disSta) {
        this.disSta = disSta;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", discountId=").append(discountId);
        sb.append(", disMes=").append(disMes);
        sb.append(", disRelease=").append(disRelease);
        sb.append(", disDeadline=").append(disDeadline);
        sb.append(", disSta=").append(disSta);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}