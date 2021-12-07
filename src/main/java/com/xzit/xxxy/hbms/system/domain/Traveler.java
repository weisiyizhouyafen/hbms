package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Traveler implements Serializable {
    private Integer travelerId;

    private Date traStrtime;

    private Date traEndtime;

    private Integer traHis;

    private static final long serialVersionUID = 1L;

    public Integer getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(Integer travelerId) {
        this.travelerId = travelerId;
    }

    public Date getTraStrtime() {
        return traStrtime;
    }

    public void setTraStrtime(Date traStrtime) {
        this.traStrtime = traStrtime;
    }

    public Date getTraEndtime() {
        return traEndtime;
    }

    public void setTraEndtime(Date traEndtime) {
        this.traEndtime = traEndtime;
    }

    public Integer getTraHis() {
        return traHis;
    }

    public void setTraHis(Integer traHis) {
        this.traHis = traHis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", travelerId=").append(travelerId);
        sb.append(", traStrtime=").append(traStrtime);
        sb.append(", traEndtime=").append(traEndtime);
        sb.append(", traHis=").append(traHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}