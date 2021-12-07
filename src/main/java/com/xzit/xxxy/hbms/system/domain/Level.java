package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;
import java.util.Date;

public class Level implements Serializable {
    private Integer levelId;

    private Integer levelUserId;

    private Date levelUpdateTime;

    private Integer levelBefore;

    private Integer levelAfter;

    private String levelConsumpiton;

    private static final long serialVersionUID = 1L;

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getLevelUserId() {
        return levelUserId;
    }

    public void setLevelUserId(Integer levelUserId) {
        this.levelUserId = levelUserId;
    }

    public Date getLevelUpdateTime() {
        return levelUpdateTime;
    }

    public void setLevelUpdateTime(Date levelUpdateTime) {
        this.levelUpdateTime = levelUpdateTime;
    }

    public Integer getLevelBefore() {
        return levelBefore;
    }

    public void setLevelBefore(Integer levelBefore) {
        this.levelBefore = levelBefore;
    }

    public Integer getLevelAfter() {
        return levelAfter;
    }

    public void setLevelAfter(Integer levelAfter) {
        this.levelAfter = levelAfter;
    }

    public String getLevelConsumpiton() {
        return levelConsumpiton;
    }

    public void setLevelConsumpiton(String levelConsumpiton) {
        this.levelConsumpiton = levelConsumpiton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", levelId=").append(levelId);
        sb.append(", levelUserId=").append(levelUserId);
        sb.append(", levelUpdateTime=").append(levelUpdateTime);
        sb.append(", levelBefore=").append(levelBefore);
        sb.append(", levelAfter=").append(levelAfter);
        sb.append(", levelConsumpiton=").append(levelConsumpiton);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}