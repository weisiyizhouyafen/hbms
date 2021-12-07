package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Locker;

public interface LockerMapper {
    int deleteByPrimaryKey(Integer lockerId);

    int insert(Locker record);

    int insertSelective(Locker record);

    Locker selectByPrimaryKey(Integer lockerId);

    int updateByPrimaryKeySelective(Locker record);

    int updateByPrimaryKey(Locker record);
}