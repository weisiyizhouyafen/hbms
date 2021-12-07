package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Gate;

public interface GateMapper {
    int deleteByPrimaryKey(Integer gateId);

    int insert(Gate record);

    int insertSelective(Gate record);

    Gate selectByPrimaryKey(Integer gateId);

    int updateByPrimaryKeySelective(Gate record);

    int updateByPrimaryKey(Gate record);
}