package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Manger implements Serializable {
    private Integer mangerId;

    private String manName;

    private String manRealname;

    private String manPass;

    private String manSex;

    private Date manBir;

    private String manPhone;

    private String manAddress;

    private Date ctime;

    private String orders;

    private static final long serialVersionUID = 1L;

    public Integer getMangerId() {
        return mangerId;
    }

    public void setMangerId(Integer mangerId) {
        this.mangerId = mangerId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getManRealname() {
        return manRealname;
    }

    public void setManRealname(String manRealname) {
        this.manRealname = manRealname;
    }

    public String getManPass() {
        return manPass;
    }

    public void setManPass(String manPass) {
        this.manPass = manPass;
    }

    public String getManSex() {
        return manSex;
    }

    public void setManSex(String manSex) {
        this.manSex = manSex;
    }

    public Date getManBir() {
        return manBir;
    }

    public void setManBir(Date manBir) {
        this.manBir = manBir;
    }

    public String getManPhone() {
        return manPhone;
    }

    public void setManPhone(String manPhone) {
        this.manPhone = manPhone;
    }

    public String getManAddress() {
        return manAddress;
    }

    public void setManAddress(String manAddress) {
        this.manAddress = manAddress;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mangerId=").append(mangerId);
        sb.append(", manName=").append(manName);
        sb.append(", manRealname=").append(manRealname);
        sb.append(", manPass=").append(manPass);
        sb.append(", manSex=").append(manSex);
        sb.append(", manBir=").append(manBir);
        sb.append(", manPhone=").append(manPhone);
        sb.append(", manAddress=").append(manAddress);
        sb.append(", ctime=").append(ctime);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}