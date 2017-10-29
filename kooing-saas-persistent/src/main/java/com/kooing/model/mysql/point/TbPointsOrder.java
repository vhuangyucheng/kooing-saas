package com.kooing.model.mysql.point;

import java.util.Date;

public class TbPointsOrder {
    private Integer pointOrderid;

    private String uuid;

    private Integer appId;

    private String pointOrdersn;

    private Integer pointBuyerid;

    private String pointBuyername;

    private String pointBuyeremail;

    private Date pointAddtime;

    private Date pointShippingtime;

    private String pointShippingcode;

    private String pointShippingEcode;

    private Date pointFinnshedtime;

    private Integer pointAllpoint;

    private String pointOrdermessage;

    private Integer pointOrderstate;

    private Date updateTime;

    public Integer getPointOrderid() {
        return pointOrderid;
    }

    public void setPointOrderid(Integer pointOrderid) {
        this.pointOrderid = pointOrderid;
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

    public String getPointOrdersn() {
        return pointOrdersn;
    }

    public void setPointOrdersn(String pointOrdersn) {
        this.pointOrdersn = pointOrdersn == null ? null : pointOrdersn.trim();
    }

    public Integer getPointBuyerid() {
        return pointBuyerid;
    }

    public void setPointBuyerid(Integer pointBuyerid) {
        this.pointBuyerid = pointBuyerid;
    }

    public String getPointBuyername() {
        return pointBuyername;
    }

    public void setPointBuyername(String pointBuyername) {
        this.pointBuyername = pointBuyername == null ? null : pointBuyername.trim();
    }

    public String getPointBuyeremail() {
        return pointBuyeremail;
    }

    public void setPointBuyeremail(String pointBuyeremail) {
        this.pointBuyeremail = pointBuyeremail == null ? null : pointBuyeremail.trim();
    }

    public Date getPointAddtime() {
        return pointAddtime;
    }

    public void setPointAddtime(Date pointAddtime) {
        this.pointAddtime = pointAddtime;
    }

    public Date getPointShippingtime() {
        return pointShippingtime;
    }

    public void setPointShippingtime(Date pointShippingtime) {
        this.pointShippingtime = pointShippingtime;
    }

    public String getPointShippingcode() {
        return pointShippingcode;
    }

    public void setPointShippingcode(String pointShippingcode) {
        this.pointShippingcode = pointShippingcode == null ? null : pointShippingcode.trim();
    }

    public String getPointShippingEcode() {
        return pointShippingEcode;
    }

    public void setPointShippingEcode(String pointShippingEcode) {
        this.pointShippingEcode = pointShippingEcode == null ? null : pointShippingEcode.trim();
    }

    public Date getPointFinnshedtime() {
        return pointFinnshedtime;
    }

    public void setPointFinnshedtime(Date pointFinnshedtime) {
        this.pointFinnshedtime = pointFinnshedtime;
    }

    public Integer getPointAllpoint() {
        return pointAllpoint;
    }

    public void setPointAllpoint(Integer pointAllpoint) {
        this.pointAllpoint = pointAllpoint;
    }

    public String getPointOrdermessage() {
        return pointOrdermessage;
    }

    public void setPointOrdermessage(String pointOrdermessage) {
        this.pointOrdermessage = pointOrdermessage == null ? null : pointOrdermessage.trim();
    }

    public Integer getPointOrderstate() {
        return pointOrderstate;
    }

    public void setPointOrderstate(Integer pointOrderstate) {
        this.pointOrderstate = pointOrderstate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}