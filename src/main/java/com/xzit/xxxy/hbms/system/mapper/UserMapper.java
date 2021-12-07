package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}