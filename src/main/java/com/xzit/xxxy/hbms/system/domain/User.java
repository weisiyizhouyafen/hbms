package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userRealname;

    private String userPwd;

    private Date userBir;

    private String userPhone;

    private Long userSex;

    private String userAddress;

    private String userDeposit;

    private Integer userHis;

    private Integer userCard;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getUserBir() {
        return userBir;
    }

    public void setUserBir(Date userBir) {
        this.userBir = userBir;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Long getUserSex() {
        return userSex;
    }

    public void setUserSex(Long userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserDeposit() {
        return userDeposit;
    }

    public void setUserDeposit(String userDeposit) {
        this.userDeposit = userDeposit;
    }

    public Integer getUserHis() {
        return userHis;
    }

    public void setUserHis(Integer userHis) {
        this.userHis = userHis;
    }

    public Integer getUserCard() {
        return userCard;
    }

    public void setUserCard(Integer userCard) {
        this.userCard = userCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userBir=").append(userBir);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userSex=").append(userSex);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userDeposit=").append(userDeposit);
        sb.append(", userHis=").append(userHis);
        sb.append(", userCard=").append(userCard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}