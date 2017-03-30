package com.jhon.rain.dao;

import com.jhon.rain.model.HdActionSettingsPredefDO;

public interface HdActionSettingsPredefDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HdActionSettingsPredefDO record);

    int insertSelective(HdActionSettingsPredefDO record);

    HdActionSettingsPredefDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HdActionSettingsPredefDO record);

    int updateByPrimaryKey(HdActionSettingsPredefDO record);
}