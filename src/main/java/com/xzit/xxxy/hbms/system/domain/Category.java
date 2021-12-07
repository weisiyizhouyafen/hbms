package com.xzit.xxxy.hbms.system.domain;

import java.io.Serializable;

public class Category implements Serializable {
    private Integer categoryId;

    private String catName;

    private Integer catCost;

    private static final long serialVersionUID = 1L;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getCatCost() {
        return catCost;
    }

    public void setCatCost(Integer catCost) {
        this.catCost = catCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", catName=").append(catName);
        sb.append(", catCost=").append(catCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}