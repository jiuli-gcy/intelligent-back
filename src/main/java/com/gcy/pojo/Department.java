package com.gcy.pojo;

import java.util.Date;

public class Department {
    private Integer departmentId;

    private String departmentName;

    private String departmentDes;

    private Date createTime;

    private Date updateTime;

    public Department(Integer departmentId, String departmentName, String departmentDes, Date createTime, Date updateTime) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentDes = departmentDes;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Department() {
        super();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentDes() {
        return departmentDes;
    }

    public void setDepartmentDes(String departmentDes) {
        this.departmentDes = departmentDes == null ? null : departmentDes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}