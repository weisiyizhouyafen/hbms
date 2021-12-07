package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;

public class Project implements Serializable {
    private Integer projectId;

    private String proName;

    private String proCharge;

    private String proMes;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProCharge() {
        return proCharge;
    }

    public void setProCharge(String proCharge) {
        this.proCharge = proCharge;
    }

    public String getProMes() {
        return proMes;
    }

    public void setProMes(String proMes) {
        this.proMes = proMes;
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
        sb.append(", projectId=").append(projectId);
        sb.append(", proName=").append(proName);
        sb.append(", proCharge=").append(proCharge);
        sb.append(", proMes=").append(proMes);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}