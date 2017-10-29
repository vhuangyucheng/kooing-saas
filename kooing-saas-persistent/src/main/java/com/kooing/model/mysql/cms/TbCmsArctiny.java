package com.kooing.model.mysql.cms;

import java.util.Date;

public class TbCmsArctiny {
    private Integer arctinyId;

    private Integer appId;

    private String uuid;

    private Integer arctypeId;

    private String arctinyName;

    private String arctinyPic;

    private String carouselPic;

    private Integer arctinySort;

    private String arctinyIntro;

    private String belongClassName;

    private Date updateTime;

    private String arctinyContent;

    public Integer getArctinyId() {
        return arctinyId;
    }

    public void setArctinyId(Integer arctinyId) {
        this.arctinyId = arctinyId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getArctypeId() {
        return arctypeId;
    }

    public void setArctypeId(Integer arctypeId) {
        this.arctypeId = arctypeId;
    }

    public String getArctinyName() {
        return arctinyName;
    }

    public void setArctinyName(String arctinyName) {
        this.arctinyName = arctinyName == null ? null : arctinyName.trim();
    }

    public String getArctinyPic() {
        return arctinyPic;
    }

    public void setArctinyPic(String arctinyPic) {
        this.arctinyPic = arctinyPic == null ? null : arctinyPic.trim();
    }

    public String getCarouselPic() {
        return carouselPic;
    }

    public void setCarouselPic(String carouselPic) {
        this.carouselPic = carouselPic == null ? null : carouselPic.trim();
    }

    public Integer getArctinySort() {
        return arctinySort;
    }

    public void setArctinySort(Integer arctinySort) {
        this.arctinySort = arctinySort;
    }

    public String getArctinyIntro() {
        return arctinyIntro;
    }

    public void setArctinyIntro(String arctinyIntro) {
        this.arctinyIntro = arctinyIntro == null ? null : arctinyIntro.trim();
    }

    public String getBelongClassName() {
        return belongClassName;
    }

    public void setBelongClassName(String belongClassName) {
        this.belongClassName = belongClassName == null ? null : belongClassName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getArctinyContent() {
        return arctinyContent;
    }

    public void setArctinyContent(String arctinyContent) {
        this.arctinyContent = arctinyContent == null ? null : arctinyContent.trim();
    }
}