package com.gcy.dao;

import com.gcy.pojo.PlanDetail;

public interface PlanDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlanDetail record);

    int insertSelective(PlanDetail record);

    PlanDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlanDetail record);

    int updateByPrimaryKey(PlanDetail record);
}