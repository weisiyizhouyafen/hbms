package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Gate implements Serializable {
    private Integer gateId;

    private Long gatSta;

    private Integer gatUserId;

    private Date gatDate;

    private static final long serialVersionUID = 1L;

    public Integer getGateId() {
        return gateId;
    }

    public void setGateId(Integer gateId) {
        this.gateId = gateId;
    }

    public Long getGatSta() {
        return gatSta;
    }

    public void setGatSta(Long gatSta) {
        this.gatSta = gatSta;
    }

    public Integer getGatUserId() {
        return gatUserId;
    }

    public void setGatUserId(Integer gatUserId) {
        this.gatUserId = gatUserId;
    }

    public Date getGatDate() {
        return gatDate;
    }

    public void setGatDate(Date gatDate) {
        this.gatDate = gatDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gateId=").append(gateId);
        sb.append(", gatSta=").append(gatSta);
        sb.append(", gatUserId=").append(gatUserId);
        sb.append(", gatDate=").append(gatDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}