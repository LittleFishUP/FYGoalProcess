package com.dxc.activitidemo.performanceprocess.dao;

import com.dxc.activitidemo.performanceprocess.entity.EmEval;
import com.dxc.activitidemo.performanceprocess.entity.MidTermGoal;

import java.util.List;

public interface EmEvalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmEval record);

    int insertSelective(EmEval record);

    EmEval selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmEval record);

    int updateByPrimaryKey(EmEval record);

    List<MidTermGoal> selectByuserid(Integer userid);
}