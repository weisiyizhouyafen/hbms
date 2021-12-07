package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.History;

public interface HistoryMapper {
    int deleteByPrimaryKey(Integer historyId);

    int insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(Integer historyId);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
}