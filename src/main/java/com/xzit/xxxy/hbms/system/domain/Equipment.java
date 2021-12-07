package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;

public class Equipment implements Serializable {
    private Integer equpmentId;

    private Integer equCategoryId;

    private String equName;

    private String equSta;

    private Integer equRepair;

    private static final long serialVersionUID = 1L;

    public Integer getEqupmentId() {
        return equpmentId;
    }

    public void setEqupmentId(Integer equpmentId) {
        this.equpmentId = equpmentId;
    }

    public Integer getEquCategoryId() {
        return equCategoryId;
    }

    public void setEquCategoryId(Integer equCategoryId) {
        this.equCategoryId = equCategoryId;
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName;
    }

    public String getEquSta() {
        return equSta;
    }

    public void setEquSta(String equSta) {
        this.equSta = equSta;
    }

    public Integer getEquRepair() {
        return equRepair;
    }

    public void setEquRepair(Integer equRepair) {
        this.equRepair = equRepair;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equpmentId=").append(equpmentId);
        sb.append(", equCategoryId=").append(equCategoryId);
        sb.append(", equName=").append(equName);
        sb.append(", equSta=").append(equSta);
        sb.append(", equRepair=").append(equRepair);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}