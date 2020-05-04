package com.gcy.pojo;

public class Staff {
    private Integer staffId;

    private String staffPass;

    private String staffName;

    private String staffSex;

    private String staffTel;

    private Integer staffLevel;

    private String staffLocation;

    private Integer staffDepartment;

    public Staff(Integer staffId, String staffPass, String staffName, String staffSex, String staffTel, Integer staffLevel, String staffLocation, Integer staffDepartment) {
        this.staffId = staffId;
        this.staffPass = staffPass;
        this.staffName = staffName;
        this.staffSex = staffSex;
        this.staffTel = staffTel;
        this.staffLevel = staffLevel;
        this.staffLocation = staffLocation;
        this.staffDepartment = staffDepartment;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffPass() {
        return staffPass;
    }

    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass == null ? null : staffPass.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel == null ? null : staffTel.trim();
    }

    public Integer getStaffLevel() {
        return staffLevel;
    }

    public void setStaffLevel(Integer staffLevel) {
        this.staffLevel = staffLevel;
    }

    public String getStaffLocation() {
        return staffLocation;
    }

    public void setStaffLocation(String staffLocation) {
        this.staffLocation = staffLocation == null ? null : staffLocation.trim();
    }

    public Integer getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(Integer staffDepartment) {
        this.staffDepartment = staffDepartment;
    }
}