package com.gcy.pojo;

public class PlanDetail {
    private Integer id;

    private Integer planId;

    private Integer areaId;

    private Integer order;

    private String keywords;

    public PlanDetail(Integer id, Integer planId, Integer areaId, Integer order, String keywords) {
        this.id = id;
        this.planId = planId;
        this.areaId = areaId;
        this.order = order;
        this.keywords = keywords;
    }

    public PlanDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }
}