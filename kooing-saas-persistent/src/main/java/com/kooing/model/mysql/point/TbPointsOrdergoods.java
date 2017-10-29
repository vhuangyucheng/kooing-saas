package com.kooing.model.mysql.point;

import java.util.Date;

public class TbPointsOrdergoods {
    private Integer pointRecid;

    private String uuid;

    private Integer appId;

    private Integer pointOrderid;

    private Integer pointGoodsid;

    private String pointGoodsname;

    private Integer pointGoodspoints;

    private Integer pointGoodsnum;

    private String pointGoodsimage;

    private Date updateTime;

    public Integer getPointRecid() {
        return pointRecid;
    }

    public void setPointRecid(Integer pointRecid) {
        this.pointRecid = pointRecid;
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

    public Integer getPointOrderid() {
        return pointOrderid;
    }

    public void setPointOrderid(Integer pointOrderid) {
        this.pointOrderid = pointOrderid;
    }

    public Integer getPointGoodsid() {
        return pointGoodsid;
    }

    public void setPointGoodsid(Integer pointGoodsid) {
        this.pointGoodsid = pointGoodsid;
    }

    public String getPointGoodsname() {
        return pointGoodsname;
    }

    public void setPointGoodsname(String pointGoodsname) {
        this.pointGoodsname = pointGoodsname == null ? null : pointGoodsname.trim();
    }

    public Integer getPointGoodspoints() {
        return pointGoodspoints;
    }

    public void setPointGoodspoints(Integer pointGoodspoints) {
        this.pointGoodspoints = pointGoodspoints;
    }

    public Integer getPointGoodsnum() {
        return pointGoodsnum;
    }

    public void setPointGoodsnum(Integer pointGoodsnum) {
        this.pointGoodsnum = pointGoodsnum;
    }

    public String getPointGoodsimage() {
        return pointGoodsimage;
    }

    public void setPointGoodsimage(String pointGoodsimage) {
        this.pointGoodsimage = pointGoodsimage == null ? null : pointGoodsimage.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}