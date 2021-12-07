package com.xzit.xxxy.hbms.system.mapper;

import com.xzit.xxxy.hbms.system.domain.Card;

public interface CardMapper {
    int deleteByPrimaryKey(Integer cardId);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Integer cardId);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}