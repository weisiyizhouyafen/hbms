package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Level;

public interface LevelMapper {
    int deleteByPrimaryKey(Integer levelId);

    int insert(Level record);

    int insertSelective(Level record);

    Level selectByPrimaryKey(Integer levelId);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);
}