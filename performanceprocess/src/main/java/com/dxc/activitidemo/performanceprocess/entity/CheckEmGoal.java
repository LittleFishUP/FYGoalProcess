package com.dxc.activitidemo.performanceprocess.entity;

public class CheckEmGoal {

    private Integer userid;

    private String name;

    private String Group;

    private String title;

    private String descript;

    private String DoData;

    private String Status;

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getDoData() {
        return DoData;
    }

    public void setDoData(String doData) {
        DoData = doData;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
