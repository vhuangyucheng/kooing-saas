package com.kooing.model.mysql.activity;

import java.util.Date;

public class TbSysActivityModule {
    private Integer moduleId;

    private String moduleName;

    private String moduleType;

    private String moduleClassname;

    private String moduleDesc;

    private Integer isneedVerify;

    private Integer isneedReg;

    private Date effDate;

    private Date expDate;

    private Integer state;

    private Date updateTime;

    private Date createTime;

    private Integer isExtendModule;

    private String iconClass;

    private String imgPath;

    private String isAppPrivate;

    private Integer sort;

    private String isSalesPromotion;

    private String protocolText;

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

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public String getModuleClassname() {
        return moduleClassname;
    }

    public void setModuleClassname(String moduleClassname) {
        this.moduleClassname = moduleClassname == null ? null : moduleClassname.trim();
    }

    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc == null ? null : moduleDesc.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getIsExtendModule() {
        return isExtendModule;
    }

    public void setIsExtendModule(Integer isExtendModule) {
        this.isExtendModule = isExtendModule;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass == null ? null : iconClass.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getIsAppPrivate() {
        return isAppPrivate;
    }

    public void setIsAppPrivate(String isAppPrivate) {
        this.isAppPrivate = isAppPrivate == null ? null : isAppPrivate.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIsSalesPromotion() {
        return isSalesPromotion;
    }

    public void setIsSalesPromotion(String isSalesPromotion) {
        this.isSalesPromotion = isSalesPromotion == null ? null : isSalesPromotion.trim();
    }

    public String getProtocolText() {
        return protocolText;
    }

    public void setProtocolText(String protocolText) {
        this.protocolText = protocolText == null ? null : protocolText.trim();
    }
}