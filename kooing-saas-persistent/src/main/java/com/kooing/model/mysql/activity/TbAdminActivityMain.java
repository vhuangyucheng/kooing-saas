package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbAdminActivityMain {
    private Integer activityId;

    private String uuid;

    private Integer appId;

    private String activityTitle;

    private Integer moduleId;

    private String moduleName;

    private Integer activityType;

    private Date effTime;

    private Date expTime;

    private Integer activityState;

    private Date updateTime;

    private Date createTime;

    private Integer isneedVerify;

    private Integer isneedReg;

    private Date endSignTime;

    private Date startSignTime;

    private Integer islimitGoodtype;

    private Integer islimitShop;

    private String advertisePic;

    private String activityTags;

    private String activityNo;

    private Integer issendShutMsg;

    private Integer limitApplyTimes;

    private String activityDesc;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getEffTime() {
        return effTime;
    }

    public void setEffTime(Date effTime) {
        this.effTime = effTime;
    }

    public Date getExpTime() {
        return expTime;
    }

    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    public Integer getActivityState() {
        return activityState;
    }

    public void setActivityState(Integer activityState) {
        this.activityState = activityState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsneedVerify() {
        return isneedVerify;
    }

    public void setIsneedVerify(Integer isneedVerify) {
        this.isneedVerify = isneedVerify;
    }

    public Integer getIsneedReg() {
        return isneedReg;
    }

    public void setIsneedReg(Integer isneedReg) {
        this.isneedReg = isneedReg;
    }

    public Date getEndSignTime() {
        return endSignTime;
    }

    public void setEndSignTime(Date endSignTime) {
        this.endSignTime = endSignTime;
    }

    public Date getStartSignTime() {
        return startSignTime;
    }

    public void setStartSignTime(Date startSignTime) {
        this.startSignTime = startSignTime;
    }

    public Integer getIslimitGoodtype() {
        return islimitGoodtype;
    }

    public void setIslimitGoodtype(Integer islimitGoodtype) {
        this.islimitGoodtype = islimitGoodtype;
    }

    public Integer getIslimitShop() {
        return islimitShop;
    }

    public void setIslimitShop(Integer islimitShop) {
        this.islimitShop = islimitShop;
    }

    public String getAdvertisePic() {
        return advertisePic;
    }

    public void setAdvertisePic(String advertisePic) {
        this.advertisePic = advertisePic == null ? null : advertisePic.trim();
    }

    public String getActivityTags() {
        return activityTags;
    }

    public void setActivityTags(String activityTags) {
        this.activityTags = activityTags == null ? null : activityTags.trim();
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo == null ? null : activityNo.trim();
    }

    public Integer getIssendShutMsg() {
        return issendShutMsg;
    }

    public void setIssendShutMsg(Integer issendShutMsg) {
        this.issendShutMsg = issendShutMsg;
    }

    public Integer getLimitApplyTimes() {
        return limitApplyTimes;
    }

    public void setLimitApplyTimes(Integer limitApplyTimes) {
        this.limitApplyTimes = limitApplyTimes;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }
}