package com.gcy.dao;

import com.gcy.pojo.News;

public interface NewsMapper {
    int insert(News record);

    int insertSelective(News record);
}