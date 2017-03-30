package com.jhon.rain.dao;

import com.jhon.rain.model.HdConditionPredefDO;

public interface HdConditionPredefDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HdConditionPredefDO record);

    int insertSelective(HdConditionPredefDO record);

    HdConditionPredefDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HdConditionPredefDO record);

    int updateByPrimaryKey(HdConditionPredefDO record);
}