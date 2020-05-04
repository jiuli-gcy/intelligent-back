package com.gcy.pojo;

import java.util.Date;

public class Suggestion {
    private Integer suggestionId;

    private Integer userId;

    private String suggestionBody;

    private Date createTime;

    private Integer staffId;

    private Integer suggestionStatus;

    private Date updateTime;

    public Suggestion(Integer suggestionId, Integer userId, String suggestionBody, Date createTime, Integer staffId, Integer suggestionStatus, Date updateTime) {
        this.suggestionId = suggestionId;
        this.userId = userId;
        this.suggestionBody = suggestionBody;
        this.createTime = createTime;
        this.staffId = staffId;
        this.suggestionStatus = suggestionStatus;
        this.updateTime = updateTime;
    }

    public Suggestion() {
        super();
    }

    public Integer getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(Integer suggestionId) {
        this.suggestionId = suggestionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSuggestionBody() {
        return suggestionBody;
    }

    public void setSuggestionBody(String suggestionBody) {
        this.suggestionBody = suggestionBody == null ? null : suggestionBody.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getSuggestionStatus() {
        return suggestionStatus;
    }

    public void setSuggestionStatus(Integer suggestionStatus) {
        this.suggestionStatus = suggestionStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}