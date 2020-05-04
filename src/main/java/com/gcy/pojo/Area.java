package com.gcy.pojo;

import java.util.Date;

public class Area {
    private Integer areaId;

    private String areaName;

    private String areaLocation;

    private String areaDescription;

    private Integer areaPriority;

    private Integer areaMainstaff;

    private Date areaCreatetime;

    private Date areaLastedittime;

    public Area(Integer areaId, String areaName, String areaLocation, String areaDescription, Integer areaPriority, Integer areaMainstaff, Date areaCreatetime, Date areaLastedittime) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.areaLocation = areaLocation;
        this.areaDescription = areaDescription;
        this.areaPriority = areaPriority;
        this.areaMainstaff = areaMainstaff;
        this.areaCreatetime = areaCreatetime;
        this.areaLastedittime = areaLastedittime;
    }

    public Area() {
        super();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaLocation() {
        return areaLocation;
    }

    public void setAreaLocation(String areaLocation) {
        this.areaLocation = areaLocation == null ? null : areaLocation.trim();
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription == null ? null : areaDescription.trim();
    }

    public Integer getAreaPriority() {
        return areaPriority;
    }

    public void setAreaPriority(Integer areaPriority) {
        this.areaPriority = areaPriority;
    }

    public Integer getAreaMainstaff() {
        return areaMainstaff;
    }

    public void setAreaMainstaff(Integer areaMainstaff) {
        this.areaMainstaff = areaMainstaff;
    }

    public Date getAreaCreatetime() {
        return areaCreatetime;
    }

    public void setAreaCreatetime(Date areaCreatetime) {
        this.areaCreatetime = areaCreatetime;
    }

    public Date getAreaLastedittime() {
        return areaLastedittime;
    }

    public void setAreaLastedittime(Date areaLastedittime) {
        this.areaLastedittime = areaLastedittime;
    }
}