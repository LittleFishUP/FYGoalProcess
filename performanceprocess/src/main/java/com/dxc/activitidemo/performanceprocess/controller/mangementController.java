package com.dxc.activitidemo.performanceprocess.controller;

import com.dxc.activitidemo.performanceprocess.dao.*;
import com.dxc.activitidemo.performanceprocess.entity.CheckEmGoal;
import com.dxc.activitidemo.performanceprocess.entity.Goal;
import com.dxc.activitidemo.performanceprocess.entity.MidTermGoal;
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
    TeamMapper teamMapper;
    @Resource
    MrEvalMapper mrEvalMapper;
    @Resource
    UserMapper userMapper;

    /* activitiService */


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

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
    public String MidTermGoalList(Model model){
        List<MidTermGoal> MidTermGoalenittylist = emEvalMapper.selectByuserid(1);

        List<Map<String,Object>> MidTermGoallists = new ArrayList<Map<String, Object>>();

        /* goal RES1,em_eval e,
        RES1.`id`,RES1.`Title`,RES1.`Descri`,RES1.`Do_Data`,RES1.`status`
        ,RES1.`Type`,RES1.`Readonly`,RES1.`user_id`,e.`self_eval`,e.`grade` */
        for(MidTermGoal midTermGoal:MidTermGoalenittylist){
            Map<String, Object> MidTermGoallist = new HashMap<String, Object>();
            MidTermGoallist.put("goal_id",midTermGoal.getId());
            MidTermGoallist.put("Title",midTermGoal.getTitle());
            MidTermGoallist.put("Describe",midTermGoal.getDescri());
            MidTermGoallist.put("Do_Data",midTermGoal.getDoData());
            MidTermGoallist.put("status",midTermGoal.getStatus());
            MidTermGoallist.put("Type",midTermGoal.getType());
            MidTermGoallist.put("Readonly",midTermGoal.getReadonly());
            MidTermGoallist.put("user_id",midTermGoal.getUserId());
            MidTermGoallist.put("self_eval",midTermGoal.getSelfEval());
            MidTermGoallist.put("grade",midTermGoal.getGrade());
            MidTermGoallists.add(MidTermGoallist);
        }

        model.addAttribute("MidTermGoallists",MidTermGoallists);
        return "MidTermGoalList";
    }

    @RequestMapping("/CheckEmGoal")
    public String CheckEmGoal(Model model){
        List<CheckEmGoal> CheckEmGoalenittylist = teamMapper.selectByuserid(3);

        List<Map<String,Object>> CheckEmGoallists = new ArrayList<Map<String, Object>>();

        for(CheckEmGoal checkEmGoal:CheckEmGoalenittylist){
            Map<String, Object> CheckEmGoallist = new HashMap<String, Object>();
            CheckEmGoallist.put("userId",checkEmGoal.getUserid());
            CheckEmGoallist.put("name",checkEmGoal.getName());
            CheckEmGoallist.put("Group",checkEmGoal.getGroup());
            CheckEmGoallist.put("Title",checkEmGoal.getTitle());
            CheckEmGoallist.put("describe",checkEmGoal.getDescript());
            CheckEmGoallist.put("DOData",checkEmGoal.getDoData());
            CheckEmGoallist.put("Status",checkEmGoal.getStatus());
            CheckEmGoallists.add(CheckEmGoallist);
        }

        model.addAttribute("CheckEmGoallists",CheckEmGoallists);

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
