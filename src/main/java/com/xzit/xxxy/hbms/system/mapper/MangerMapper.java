package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Manger;

public interface MangerMapper {
    int deleteByPrimaryKey(Integer mangerId);

    int insert(Manger record);

    int insertSelective(Manger record);

    Manger selectByPrimaryKey(Integer mangerId);

    int updateByPrimaryKeySelective(Manger record);

    int updateByPrimaryKey(Manger record);
}