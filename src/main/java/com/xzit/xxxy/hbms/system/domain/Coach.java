package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Coach implements Serializable {
    private Integer coachId;

    private String coaName;

    private String coaSex;

    private String coaAge;

    private String coaPho;

    private String coaMail;

    private String coaPass;

    private Date coaBir;

    private String coaWorkAge;

    private String coaSta;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCoaName() {
        return coaName;
    }

    public void setCoaName(String coaName) {
        this.coaName = coaName;
    }

    public String getCoaSex() {
        return coaSex;
    }

    public void setCoaSex(String coaSex) {
        this.coaSex = coaSex;
    }

    public String getCoaAge() {
        return coaAge;
    }

    public void setCoaAge(String coaAge) {
        this.coaAge = coaAge;
    }

    public String getCoaPho() {
        return coaPho;
    }

    public void setCoaPho(String coaPho) {
        this.coaPho = coaPho;
    }

    public String getCoaMail() {
        return coaMail;
    }

    public void setCoaMail(String coaMail) {
        this.coaMail = coaMail;
    }

    public String getCoaPass() {
        return coaPass;
    }

    public void setCoaPass(String coaPass) {
        this.coaPass = coaPass;
    }

    public Date getCoaBir() {
        return coaBir;
    }

    public void setCoaBir(Date coaBir) {
        this.coaBir = coaBir;
    }

    public String getCoaWorkAge() {
        return coaWorkAge;
    }

    public void setCoaWorkAge(String coaWorkAge) {
        this.coaWorkAge = coaWorkAge;
    }

    public String getCoaSta() {
        return coaSta;
    }

    public void setCoaSta(String coaSta) {
        this.coaSta = coaSta;
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
        sb.append(", coachId=").append(coachId);
        sb.append(", coaName=").append(coaName);
        sb.append(", coaSex=").append(coaSex);
        sb.append(", coaAge=").append(coaAge);
        sb.append(", coaPho=").append(coaPho);
        sb.append(", coaMail=").append(coaMail);
        sb.append(", coaPass=").append(coaPass);
        sb.append(", coaBir=").append(coaBir);
        sb.append(", coaWorkAge=").append(coaWorkAge);
        sb.append(", coaSta=").append(coaSta);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}