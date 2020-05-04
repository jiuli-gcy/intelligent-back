package com.gcy.pojo;

public class News {
    private Integer newsId;

    private String newTitle;

    private String newsBody;

    private Integer newsLevel;

    private String newsType;

    public News(Integer newsId, String newTitle, String newsBody, Integer newsLevel, String newsType) {
        this.newsId = newsId;
        this.newTitle = newTitle;
        this.newsBody = newsBody;
        this.newsLevel = newsLevel;
        this.newsType = newsType;
    }

    public News() {
        super();
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle == null ? null : newTitle.trim();
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody == null ? null : newsBody.trim();
    }

    public Integer getNewsLevel() {
        return newsLevel;
    }

    public void setNewsLevel(Integer newsLevel) {
        this.newsLevel = newsLevel;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }
}