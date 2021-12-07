package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {
    private Integer historyId;

    private Date hisDate;

    private String hisMoney;

    private Integer hisDisc;

    private Integer hisCoaId;

    private String hisCoaName;

    private Integer hisPro;

    private String hisRelmony;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Date getHisDate() {
        return hisDate;
    }

    public void setHisDate(Date hisDate) {
        this.hisDate = hisDate;
    }

    public String getHisMoney() {
        return hisMoney;
    }

    public void setHisMoney(String hisMoney) {
        this.hisMoney = hisMoney;
    }

    public Integer getHisDisc() {
        return hisDisc;
    }

    public void setHisDisc(Integer hisDisc) {
        this.hisDisc = hisDisc;
    }

    public Integer getHisCoaId() {
        return hisCoaId;
    }

    public void setHisCoaId(Integer hisCoaId) {
        this.hisCoaId = hisCoaId;
    }

    public String getHisCoaName() {
        return hisCoaName;
    }

    public void setHisCoaName(String hisCoaName) {
        this.hisCoaName = hisCoaName;
    }

    public Integer getHisPro() {
        return hisPro;
    }

    public void setHisPro(Integer hisPro) {
        this.hisPro = hisPro;
    }

    public String getHisRelmony() {
        return hisRelmony;
    }

    public void setHisRelmony(String hisRelmony) {
        this.hisRelmony = hisRelmony;
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
        sb.append(", historyId=").append(historyId);
        sb.append(", hisDate=").append(hisDate);
        sb.append(", hisMoney=").append(hisMoney);
        sb.append(", hisDisc=").append(hisDisc);
        sb.append(", hisCoaId=").append(hisCoaId);
        sb.append(", hisCoaName=").append(hisCoaName);
        sb.append(", hisPro=").append(hisPro);
        sb.append(", hisRelmony=").append(hisRelmony);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}