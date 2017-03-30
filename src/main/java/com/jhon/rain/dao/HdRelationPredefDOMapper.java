package com.jhon.rain.dao;

import com.jhon.rain.model.HdRelationPredefDO;

public interface HdRelationPredefDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HdRelationPredefDO record);

    int insertSelective(HdRelationPredefDO record);

    HdRelationPredefDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HdRelationPredefDO record);

    int updateByPrimaryKey(HdRelationPredefDO record);
}