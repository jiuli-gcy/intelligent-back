package com.gcy.pojo;

public class Facilities {
    private Integer facilitiesId;

    private String facilitiesName;

    private Integer areaId;

    private String facilitiesDes;

    public Facilities(Integer facilitiesId, String facilitiesName, Integer areaId, String facilitiesDes) {
        this.facilitiesId = facilitiesId;
        this.facilitiesName = facilitiesName;
        this.areaId = areaId;
        this.facilitiesDes = facilitiesDes;
    }

    public Facilities() {
        super();
    }

    public Integer getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(Integer facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public String getFacilitiesName() {
        return facilitiesName;
    }

    public void setFacilitiesName(String facilitiesName) {
        this.facilitiesName = facilitiesName == null ? null : facilitiesName.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getFacilitiesDes() {
        return facilitiesDes;
    }

    public void setFacilitiesDes(String facilitiesDes) {
        this.facilitiesDes = facilitiesDes == null ? null : facilitiesDes.trim();
    }
}