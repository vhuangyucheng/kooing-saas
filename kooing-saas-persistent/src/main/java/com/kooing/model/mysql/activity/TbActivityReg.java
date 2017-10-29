package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbActivityReg {
    private Integer regId;

    private String uuid;

    private Integer appId;

    private String regName;

    private Integer activityId;

    private String activityName;

    private Integer moduleId;

    private String moduleName;

    private Integer activityType;

    private Date effDate;

    private Date expDate;

    private Integer crowdFundingState;

    private Integer state;

    private Integer orgFlag;

    private String orgId;

    private String orgName;

    private Date createTime;

    private Date publishTime;

    private Date updateTime;

    private String publishUserid;

    private Integer availableHour;

    private Integer limitPeopleNum;

    private String activityNo;

    private String regPic;

    private Integer isLimitTop;

    private Integer totalPriceOld;

    private Integer isneedReg;

    private Integer isneedVerify;

    private Integer isDelete;

    private Integer totalPriceNew;

    private Integer targetAmount;

    private Integer shippingTime;

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
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

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName == null ? null : regName.trim();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
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

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getCrowdFundingState() {
        return crowdFundingState;
    }

    public void setCrowdFundingState(Integer crowdFundingState) {
        this.crowdFundingState = crowdFundingState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOrgFlag() {
        return orgFlag;
    }

    public void setOrgFlag(Integer orgFlag) {
        this.orgFlag = orgFlag;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPublishUserid() {
        return publishUserid;
    }

    public void setPublishUserid(String publishUserid) {
        this.publishUserid = publishUserid == null ? null : publishUserid.trim();
    }

    public Integer getAvailableHour() {
        return availableHour;
    }

    public void setAvailableHour(Integer availableHour) {
        this.availableHour = availableHour;
    }

    public Integer getLimitPeopleNum() {
        return limitPeopleNum;
    }

    public void setLimitPeopleNum(Integer limitPeopleNum) {
        this.limitPeopleNum = limitPeopleNum;
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo == null ? null : activityNo.trim();
    }

    public String getRegPic() {
        return regPic;
    }

    public void setRegPic(String regPic) {
        this.regPic = regPic == null ? null : regPic.trim();
    }

    public Integer getIsLimitTop() {
        return isLimitTop;
    }

    public void setIsLimitTop(Integer isLimitTop) {
        this.isLimitTop = isLimitTop;
    }

    public Integer getTotalPriceOld() {
        return totalPriceOld;
    }

    public void setTotalPriceOld(Integer totalPriceOld) {
        this.totalPriceOld = totalPriceOld;
    }

    public Integer getIsneedReg() {
        return isneedReg;
    }

    public void setIsneedReg(Integer isneedReg) {
        this.isneedReg = isneedReg;
    }

    public Integer getIsneedVerify() {
        return isneedVerify;
    }

    public void setIsneedVerify(Integer isneedVerify) {
        this.isneedVerify = isneedVerify;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getTotalPriceNew() {
        return totalPriceNew;
    }

    public void setTotalPriceNew(Integer totalPriceNew) {
        this.totalPriceNew = totalPriceNew;
    }

    public Integer getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Integer targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Integer getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }
}