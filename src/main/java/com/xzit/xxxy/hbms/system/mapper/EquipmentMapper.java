package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Equipment;

public interface EquipmentMapper {
    int deleteByPrimaryKey(Integer equpmentId);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    Equipment selectByPrimaryKey(Integer equpmentId);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}