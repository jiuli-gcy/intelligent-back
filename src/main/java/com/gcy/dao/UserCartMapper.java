package com.gcy.dao;

import com.gcy.pojo.UserCart;

public interface UserCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCart record);

    int insertSelective(UserCart record);

    UserCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCart record);

    int updateByPrimaryKey(UserCart record);
}