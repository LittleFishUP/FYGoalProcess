package com.dxc.activitidemo.performanceprocess.entity;

public class CheckAllGoal {

    private Integer id;

    private String name;

    private String Group;

    private Integer managerId;

    private String Title;

    private String Descript;

    private String status;

    private String SelfEval;

    private String MREval;

    private String MRGrade;

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return Descript;
    }

    public void setDescript(String descript) {
        Descript = descript;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSelfEval() {
        return SelfEval;
    }

    public void setSelfEval(String selfEval) {
        SelfEval = selfEval;
    }

    public String getMREval() {
        return MREval;
    }

    public void setMREval(String MREval) {
        this.MREval = MREval;
    }

    public String getMRGrade() {
        return MRGrade;
    }

    public void setMRGrade(String MRGrade) {
        this.MRGrade = MRGrade;
    }
}
