package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Equip;

public interface EquipMapper {
    int deleteByPrimaryKey(Integer equpId);

    int insert(Equip record);

    int insertSelective(Equip record);

    Equip selectByPrimaryKey(Integer equpId);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);
}