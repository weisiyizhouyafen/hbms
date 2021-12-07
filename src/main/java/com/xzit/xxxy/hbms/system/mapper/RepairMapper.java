package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Repair;

public interface RepairMapper {
    int deleteByPrimaryKey(Integer repairId);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Integer repairId);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}