package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Repair implements Serializable {
    private Integer repairId;

    private Integer repEquId;

    private String repMes;

    private String repCost;

    private Date repDate;

    private static final long serialVersionUID = 1L;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Integer getRepEquId() {
        return repEquId;
    }

    public void setRepEquId(Integer repEquId) {
        this.repEquId = repEquId;
    }

    public String getRepMes() {
        return repMes;
    }

    public void setRepMes(String repMes) {
        this.repMes = repMes;
    }

    public String getRepCost() {
        return repCost;
    }

    public void setRepCost(String repCost) {
        this.repCost = repCost;
    }

    public Date getRepDate() {
        return repDate;
    }

    public void setRepDate(Date repDate) {
        this.repDate = repDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repairId=").append(repairId);
        sb.append(", repEquId=").append(repEquId);
        sb.append(", repMes=").append(repMes);
        sb.append(", repCost=").append(repCost);
        sb.append(", repDate=").append(repDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}