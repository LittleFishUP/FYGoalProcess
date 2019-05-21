package com.dxc.activitidemo.performanceprocess.controller;

import com.dxc.activitidemo.performanceprocess.dao.*;
import com.dxc.activitidemo.performanceprocess.entity.*;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    /*
    * MR menu
    * */
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
    public String EmployeeGoalEvaluation(Model model){

        List<EmployeeGoalEval> EmployeeGoalEvalenittylist = mrEvalMapper.selectByuserid(3);

        List<Map<String,Object>> EmployeeGoalEvallists = new ArrayList<Map<String, Object>>();

        for(EmployeeGoalEval employeeGoalEval:EmployeeGoalEvalenittylist){
            Map<String, Object> CheckEmGoallist = new HashMap<String, Object>();
            CheckEmGoallist.put("Goal_id",employeeGoalEval.getId());
            CheckEmGoallist.put("name",employeeGoalEval.getName());
            CheckEmGoallist.put("Group",employeeGoalEval.getGroup());
            CheckEmGoallist.put("Title",employeeGoalEval.getTitle());
            CheckEmGoallist.put("Describe",employeeGoalEval.getDescri());
            CheckEmGoallist.put("Do_Data",employeeGoalEval.getDoData());
            CheckEmGoallist.put("status",employeeGoalEval.getStatus());
            CheckEmGoallist.put("Mr_eval",employeeGoalEval.getMrEval());
            CheckEmGoallist.put("grade",employeeGoalEval.getGrade());
            EmployeeGoalEvallists.add(CheckEmGoallist);
        }

        model.addAttribute("EmployeeGoalEvallists",EmployeeGoalEvallists);

        return "EmployeeGoalEvaluation";
    }

    @RequestMapping("/HRchoseTheType")
    public String HRchoseTheType(){
        return "HRchoseTheType";
    }

    @RequestMapping("/CheckAllGoal")
    public String CheckAllGoal(Model model){

        List<CheckAllGoal> CheckAllGoalenittylist = goalMapper.selectallGoal();

        List<Map<String,Object>> CheckAllGoallists = new ArrayList<Map<String, Object>>();
        for(CheckAllGoal checkAllGoal:CheckAllGoalenittylist){
            Map<String, Object> CheckAllGoallist = new HashMap<String, Object>();
            CheckAllGoallist.put("User_id",checkAllGoal.getId());
            CheckAllGoallist.put("name",checkAllGoal.getName());
            CheckAllGoallist.put("Group",checkAllGoal.getGroup());

            if(checkAllGoal.getManagerId()==null){
                CheckAllGoallist.put("Manager","");
            }else{
                User user = userMapper.selectByPrimaryKey(checkAllGoal.getManagerId());
                CheckAllGoallist.put("Manager",user.getName());
            }

            CheckAllGoallist.put("Title",checkAllGoal.getTitle());
            CheckAllGoallist.put("Describe",checkAllGoal.getDescript());
            CheckAllGoallist.put("status",checkAllGoal.getStatus());
            CheckAllGoallist.put("selfEval",checkAllGoal.getSelfEval());
            CheckAllGoallist.put("MREval",checkAllGoal.getMREval());
            CheckAllGoallist.put("MRGrade",checkAllGoal.getMRGrade());
            CheckAllGoallists.add(CheckAllGoallist);
        }

        model.addAttribute("CheckAllGoallists",CheckAllGoallists);

        return "CheckAllGoal";
    }


    @RequestMapping("/downloadExcel")
    public void setUpExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String[] headers = { "UserID", "name","Group","Manager","Title","Describe","status","selfEval","MREval","MRGrade"};
        List<CheckAllGoal> CheckAllGoalenittylist = goalMapper.selectallGoal();

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        //设置列宽
        sheet.setDefaultColumnWidth((short) 18);
        //创建第一行的对象，第一行一般用于填充标题内容。从第二行开始一般是数据
        HSSFRow row = sheet.createRow(0);
        for (short i = 0; i < headers.length; i++) {
            //创建单元格，每行多少数据就创建多少个单元格
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            //给单元格设置内容
            cell.setCellValue(text);
        }

        //遍历集合，将每个集合元素对象的每个值填充到单元格中
        for(int i=0;i<CheckAllGoalenittylist.size();i++){
            CheckAllGoal checkAllGoal = CheckAllGoalenittylist.get(i);
            //从第二行开始填充数据
            row = sheet.createRow(i+1);
            List<String> datas=new ArrayList<>();

            String UserID = checkAllGoal.getId().toString();
            String name = checkAllGoal.getName();
            String Group = checkAllGoal.getGroup();
            String Manager;
            if(checkAllGoal.getManagerId()==null){
                Manager = "";
            }else{
                User user = userMapper.selectByPrimaryKey(checkAllGoal.getManagerId());
                Manager = user.getName();
            }
            String Title = checkAllGoal.getTitle();
            String descript = checkAllGoal.getDescript();
            String status = checkAllGoal.getStatus();
            String selfEval = checkAllGoal.getSelfEval();
            String mrEval = checkAllGoal.getMREval();
            String mrGrade = checkAllGoal.getMRGrade();


            datas.add(UserID);
            datas.add(name);
            datas.add(Group);
            datas.add(Manager);
            datas.add(Title);
            datas.add(descript);
            datas.add(status);
            datas.add(selfEval);
            datas.add(mrEval);
            datas.add(mrGrade);


            for (int j=0;j<datas.size();j++) {
                String string=datas.get(j);
                HSSFCell cell = row.createCell(j);
                HSSFRichTextString richString = new HSSFRichTextString(string);
                HSSFFont font3 = workbook.createFont();
                richString.applyFont(font3);
                cell.setCellValue(richString);
            }

        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename="+"AllGoal.xls");//Excel文件名
        try {
            response.flushBuffer();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //将workbook中的内容写入输出流中
        workbook.write(response.getOutputStream());

    }



}
