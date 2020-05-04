package com.gcy.dao;

import com.gcy.pojo.Facilities;

public interface FacilitiesMapper {
    int deleteByPrimaryKey(Integer facilitiesId);

    int insert(Facilities record);

    int insertSelective(Facilities record);

    Facilities selectByPrimaryKey(Integer facilitiesId);

    int updateByPrimaryKeySelective(Facilities record);

    int updateByPrimaryKey(Facilities record);
}