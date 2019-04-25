package com.dxc.activitidemo.performanceprocess.controller;

import com.dxc.activitidemo.performanceprocess.dao.*;
import com.dxc.activitidemo.performanceprocess.entity.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goal")
public class mangementController {

    /* databaseMapper*/
    @Resource
    EmEvalMapper emEvalMapper;
    @Resource
    GoalMapper goalMapper;
    @Resource
    GroupMapper groupMapper;
    @Resource
    MrEvalMapper mrEvalMapper;
    @Resource
    UserMapper userMapper;

    /* activitiService */

    @RequestMapping("/management")
    public String mangementpage(){
        return "managementpage";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/goallist")
    public String goallist(Model model){


        List<Goal> goalenittylist = goalMapper.selectByuserid(1);

        List<Map<String,Object>> goallists = new ArrayList<Map<String, Object>>();

        /* id, Title, Descri, Do_Data, status, Type, Readonly, user_id */
        for(Goal goal:goalenittylist){
            Map<String, Object> goallist = new HashMap<String, Object>();
            goallist.put("goal_id",goal.getId());
            goallist.put("Title",goal.getTitle());
            goallist.put("Describe",goal.getDescri());
            goallist.put("Do_Data",goal.getDoData());
            goallist.put("status",goal.getStatus());
            goallist.put("Type",goal.getType());
            goallist.put("Readonly",goal.getReadonly());
            goallist.put("user_id",goal.getUserId());
            goallists.add(goallist);
        }

        model.addAttribute("goallists",goallists);


        return "goallist";
    }

    @RequestMapping("/MidTermGoalList")
    public String MidTermGoalList(){
        return "MidTermGoalList";
    }

    @RequestMapping("/CheckEmGoal")
    public String CheckEmGoal(){
        return "CheckEmGoal";
    }

    @RequestMapping("/EmployeeGoalEvaluation")
    public String EmployeeGoalEvaluation(){
        return "EmployeeGoalEvaluation";
    }

    @RequestMapping("/HRchoseTheType")
    public String HRchoseTheType(){
        return "HRchoseTheType";
    }

    @RequestMapping("/CheckAllGoal")
    public String CheckAllGoal(){
        return "CheckAllGoal";
    }


}
