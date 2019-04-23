package com.dxc.activitidemo.performanceprocess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goal")
public class mangementController {

    @RequestMapping("/management")
    public String mangementpage(){
        return "managementpage";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/goallist")
    public String goallist(){
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
