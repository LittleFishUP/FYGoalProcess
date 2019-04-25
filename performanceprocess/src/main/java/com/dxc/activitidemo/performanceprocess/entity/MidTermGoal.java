package com.dxc.activitidemo.performanceprocess.entity;

public class MidTermGoal {
    private Integer id;

    private String title;

    private String descri;

    private String DoData;

    private String status;

    private String type;

    private Boolean readonly;

    private Integer userId;

    private String SelfEval;

    private String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getDoData() {
        return DoData;
    }

    public void setDoData(String doData) {
        DoData = doData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSelfEval() {
        return SelfEval;
    }

    public void setSelfEval(String selfEval) {
        SelfEval = selfEval;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
