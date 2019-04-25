package com.dxc.activitidemo.performanceprocess.dao;

import com.dxc.activitidemo.performanceprocess.entity.CheckEmGoal;
import com.dxc.activitidemo.performanceprocess.entity.Team;

import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    List<CheckEmGoal> selectByuserid(Integer userid);
}