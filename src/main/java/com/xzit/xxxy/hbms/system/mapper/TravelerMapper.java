package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Traveler;

public interface TravelerMapper {
    int deleteByPrimaryKey(Integer travelerId);

    int insert(Traveler record);

    int insertSelective(Traveler record);

    Traveler selectByPrimaryKey(Integer travelerId);

    int updateByPrimaryKeySelective(Traveler record);

    int updateByPrimaryKey(Traveler record);
}