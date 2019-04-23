package com.dxc.activitidemo.performanceprocess.dao;

import com.dxc.activitidemo.performanceprocess.entity.Goal;

public interface GoalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goal record);

    int insertSelective(Goal record);

    Goal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goal record);

    int updateByPrimaryKey(Goal record);
}