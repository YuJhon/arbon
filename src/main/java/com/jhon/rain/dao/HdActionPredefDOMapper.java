package com.jhon.rain.dao;

import com.jhon.rain.model.HdActionPredefDO;

public interface HdActionPredefDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HdActionPredefDO record);

    int insertSelective(HdActionPredefDO record);

    HdActionPredefDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HdActionPredefDO record);

    int updateByPrimaryKey(HdActionPredefDO record);
}