package com.dxc.activitidemo.performanceprocess.dao;

import com.dxc.activitidemo.performanceprocess.entity.EmEval;

public interface EmEvalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmEval record);

    int insertSelective(EmEval record);

    EmEval selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmEval record);

    int updateByPrimaryKey(EmEval record);
}