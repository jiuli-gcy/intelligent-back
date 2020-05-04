package com.gcy.dao;

import com.gcy.pojo.Suggestion;

public interface SuggestionMapper {
    int deleteByPrimaryKey(Integer suggestionId);

    int insert(Suggestion record);

    int insertSelective(Suggestion record);

    Suggestion selectByPrimaryKey(Integer suggestionId);

    int updateByPrimaryKeySelective(Suggestion record);

    int updateByPrimaryKey(Suggestion record);
}