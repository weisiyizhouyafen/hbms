package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Coach;

public interface CoachMapper {
    int deleteByPrimaryKey(Integer coachId);

    int insert(Coach record);

    int insertSelective(Coach record);

    Coach selectByPrimaryKey(Integer coachId);

    int updateByPrimaryKeySelective(Coach record);

    int updateByPrimaryKey(Coach record);
}