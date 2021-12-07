package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}