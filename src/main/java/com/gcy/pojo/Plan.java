package com.gcy.pojo;

public class Plan {
    private Integer planId;

    private String planName;

    private String planDescription;

    public Plan(Integer planId, String planName, String planDescription) {
        this.planId = planId;
        this.planName = planName;
        this.planDescription = planDescription;
    }

    public Plan() {
        super();
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription == null ? null : planDescription.trim();
    }
}