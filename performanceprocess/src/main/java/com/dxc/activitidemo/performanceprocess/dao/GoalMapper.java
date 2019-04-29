package com.dxc.activitidemo.performanceprocess.dao;

import com.dxc.activitidemo.performanceprocess.entity.CheckAllGoal;
import com.dxc.activitidemo.performanceprocess.entity.Goal;

import java.util.List;

public interface GoalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goal record);

    int insertSelective(Goal record);

    Goal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goal record);

    int updateByPrimaryKey(Goal record);

    List<Goal> selectByuserid(Integer userid);

    List<CheckAllGoal> selectallGoal();
}