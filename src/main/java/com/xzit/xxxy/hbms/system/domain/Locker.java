package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;

public class Locker implements Serializable {
    private Integer lockerId;

    private Long status;

    private Integer userId;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getLockerId() {
        return lockerId;
    }

    public void setLockerId(Integer lockerId) {
        this.lockerId = lockerId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        sb.append(", lockerId=").append(lockerId);
        sb.append(", status=").append(status);
        sb.append(", userId=").append(userId);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}