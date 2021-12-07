package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}