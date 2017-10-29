package com.kooing.model.mysql.goods;

import java.util.Date;

public class TbGoodsHotSearch {
    private Integer id;

    private String uuid;

    private Integer appId;

    private String hotWords;

    private Integer countNums;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getHotWords() {
        return hotWords;
    }

    public void setHotWords(String hotWords) {
        this.hotWords = hotWords == null ? null : hotWords.trim();
    }

    public Integer getCountNums() {
        return countNums;
    }

    public void setCountNums(Integer countNums) {
        this.countNums = countNums;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}