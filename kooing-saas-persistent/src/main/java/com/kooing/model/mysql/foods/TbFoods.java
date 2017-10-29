package com.kooing.model.mysql.foods;

import java.util.Date;

public class TbFoods {
    private Long foodsId;

    private Integer appId;

    private String foodsName;

    private Integer clickcount;

    private Integer likecount;

    private Integer collectcount;

    private String summary;

    private String difficultyleve;

    private String costhour;

    private Date updatetime;

    private Date createtime;

    private String tag;

    private String createman;

    private String createid;

    private String pictures;

    private String tipser;

    private Integer commentcount;

    private Integer state;

    private String stepsinfo;

    public Long getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(Long foodsId) {
        this.foodsId = foodsId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getFoodsName() {
        return foodsName;
    }

    public void setFoodsName(String foodsName) {
        this.foodsName = foodsName == null ? null : foodsName.trim();
    }

    public Integer getClickcount() {
        return clickcount;
    }

    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getCollectcount() {
        return collectcount;
    }

    public void setCollectcount(Integer collectcount) {
        this.collectcount = collectcount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getDifficultyleve() {
        return difficultyleve;
    }

    public void setDifficultyleve(String difficultyleve) {
        this.difficultyleve = difficultyleve == null ? null : difficultyleve.trim();
    }

    public String getCosthour() {
        return costhour;
    }

    public void setCosthour(String costhour) {
        this.costhour = costhour == null ? null : costhour.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman == null ? null : createman.trim();
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid == null ? null : createid.trim();
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    public String getTipser() {
        return tipser;
    }

    public void setTipser(String tipser) {
        this.tipser = tipser == null ? null : tipser.trim();
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStepsinfo() {
        return stepsinfo;
    }

    public void setStepsinfo(String stepsinfo) {
        this.stepsinfo = stepsinfo == null ? null : stepsinfo.trim();
    }
}