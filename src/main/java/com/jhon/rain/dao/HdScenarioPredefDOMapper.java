package com.jhon.rain.dao;

import com.jhon.rain.model.HdScenarioPredefDO;

public interface HdScenarioPredefDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HdScenarioPredefDO record);

    int insertSelective(HdScenarioPredefDO record);

    HdScenarioPredefDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HdScenarioPredefDO record);

    int updateByPrimaryKey(HdScenarioPredefDO record);
}