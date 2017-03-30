package com.jhon.rain.dao;

import com.jhon.rain.model.HdRulePredefDO;

public interface HdRulePredefDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HdRulePredefDO record);

    int insertSelective(HdRulePredefDO record);

    HdRulePredefDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HdRulePredefDO record);

    int updateByPrimaryKey(HdRulePredefDO record);
}