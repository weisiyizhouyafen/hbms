package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Discount;

public interface DiscountMapper {
    int deleteByPrimaryKey(Integer discountId);

    int insert(Discount record);

    int insertSelective(Discount record);

    Discount selectByPrimaryKey(Integer discountId);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
}