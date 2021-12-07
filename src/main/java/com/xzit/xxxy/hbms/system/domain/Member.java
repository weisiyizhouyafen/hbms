package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private Integer memberId;

    private String menName;

    private String menRealname;

    private String menSex;

    private Date menBir;

    private String menAddress;

    private String menPhone;

    private String menPwd;

    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMenName() {
        return menName;
    }

    public void setMenName(String menName) {
        this.menName = menName;
    }

    public String getMenRealname() {
        return menRealname;
    }

    public void setMenRealname(String menRealname) {
        this.menRealname = menRealname;
    }

    public String getMenSex() {
        return menSex;
    }

    public void setMenSex(String menSex) {
        this.menSex = menSex;
    }

    public Date getMenBir() {
        return menBir;
    }

    public void setMenBir(Date menBir) {
        this.menBir = menBir;
    }

    public String getMenAddress() {
        return menAddress;
    }

    public void setMenAddress(String menAddress) {
        this.menAddress = menAddress;
    }

    public String getMenPhone() {
        return menPhone;
    }

    public void setMenPhone(String menPhone) {
        this.menPhone = menPhone;
    }

    public String getMenPwd() {
        return menPwd;
    }

    public void setMenPwd(String menPwd) {
        this.menPwd = menPwd;
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
        sb.append(", memberId=").append(memberId);
        sb.append(", menName=").append(menName);
        sb.append(", menRealname=").append(menRealname);
        sb.append(", menSex=").append(menSex);
        sb.append(", menBir=").append(menBir);
        sb.append(", menAddress=").append(menAddress);
        sb.append(", menPhone=").append(menPhone);
        sb.append(", menPwd=").append(menPwd);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}