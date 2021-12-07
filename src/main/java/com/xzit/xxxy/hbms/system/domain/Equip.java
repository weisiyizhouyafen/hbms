package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;

public class Equip implements Serializable {
    private Integer equpId;

    private String equpName;

    private Integer equpQuantity;

    private String equpUsed;

    private String equpUnuse;

    private Integer equpRepair;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getEqupId() {
        return equpId;
    }

    public void setEqupId(Integer equpId) {
        this.equpId = equpId;
    }

    public String getEqupName() {
        return equpName;
    }

    public void setEqupName(String equpName) {
        this.equpName = equpName;
    }

    public Integer getEqupQuantity() {
        return equpQuantity;
    }

    public void setEqupQuantity(Integer equpQuantity) {
        this.equpQuantity = equpQuantity;
    }

    public String getEqupUsed() {
        return equpUsed;
    }

    public void setEqupUsed(String equpUsed) {
        this.equpUsed = equpUsed;
    }

    public String getEqupUnuse() {
        return equpUnuse;
    }

    public void setEqupUnuse(String equpUnuse) {
        this.equpUnuse = equpUnuse;
    }

    public Integer getEqupRepair() {
        return equpRepair;
    }

    public void setEqupRepair(Integer equpRepair) {
        this.equpRepair = equpRepair;
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
        sb.append(", equpId=").append(equpId);
        sb.append(", equpName=").append(equpName);
        sb.append(", equpQuantity=").append(equpQuantity);
        sb.append(", equpUsed=").append(equpUsed);
        sb.append(", equpUnuse=").append(equpUnuse);
        sb.append(", equpRepair=").append(equpRepair);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}