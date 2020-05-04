package com.gcy.dao;

import com.gcy.pojo.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}