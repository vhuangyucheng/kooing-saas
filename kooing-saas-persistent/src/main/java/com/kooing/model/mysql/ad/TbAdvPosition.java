package com.kooing.model.mysql.ad;

import java.util.Date;

public class TbAdvPosition {
    private Integer positionId;

    private String uuid;

    private Integer appId;

    private String apName;

    private String apIntro;

    private Integer apClass;

    private Integer apDisplay;

    private Integer isUse;

    private Integer apWidth;

    private Integer apHeight;

    private Integer apPrice;

    private Integer advNum;

    private Integer clickNum;

    private String defaultContent;

    private Date updateTime;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
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

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName == null ? null : apName.trim();
    }

    public String getApIntro() {
        return apIntro;
    }

    public void setApIntro(String apIntro) {
        this.apIntro = apIntro == null ? null : apIntro.trim();
    }

    public Integer getApClass() {
        return apClass;
    }

    public void setApClass(Integer apClass) {
        this.apClass = apClass;
    }

    public Integer getApDisplay() {
        return apDisplay;
    }

    public void setApDisplay(Integer apDisplay) {
        this.apDisplay = apDisplay;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Integer getApWidth() {
        return apWidth;
    }

    public void setApWidth(Integer apWidth) {
        this.apWidth = apWidth;
    }

    public Integer getApHeight() {
        return apHeight;
    }

    public void setApHeight(Integer apHeight) {
        this.apHeight = apHeight;
    }

    public Integer getApPrice() {
        return apPrice;
    }

    public void setApPrice(Integer apPrice) {
        this.apPrice = apPrice;
    }

    public Integer getAdvNum() {
        return advNum;
    }

    public void setAdvNum(Integer advNum) {
        this.advNum = advNum;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public String getDefaultContent() {
        return defaultContent;
    }

    public void setDefaultContent(String defaultContent) {
        this.defaultContent = defaultContent == null ? null : defaultContent.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}