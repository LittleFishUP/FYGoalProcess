package com.dxc.activitidemo.performanceprocess.dao;

import com.dxc.activitidemo.performanceprocess.entity.EmployeeGoalEval;
import com.dxc.activitidemo.performanceprocess.entity.MrEval;

import java.util.List;

public interface MrEvalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MrEval record);

    int insertSelective(MrEval record);

    MrEval selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrEval record);

    int updateByPrimaryKey(MrEval record);

    List<EmployeeGoalEval> selectByuserid(Integer userid);

}