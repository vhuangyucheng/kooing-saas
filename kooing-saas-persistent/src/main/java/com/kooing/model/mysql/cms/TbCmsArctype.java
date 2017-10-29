package com.kooing.model.mysql.cms;

import java.util.Date;

public class TbCmsArctype {
    private Integer arctypeId;

    private Integer appId;

    private String uuid;

    private String typeCode;

    private String typeName;

    private Integer upperId;

    private Integer arctypeSort;

    private String arctypePic;

    private String carouselImage;

    private String belongClassName;

    private Integer state;

    private String arctypeDescribe;

    private Date createTime;

    private Date updateTime;

    public Integer getArctypeId() {
        return arctypeId;
    }

    public void setArctypeId(Integer arctypeId) {
        this.arctypeId = arctypeId;
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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getUpperId() {
        return upperId;
    }

    public void setUpperId(Integer upperId) {
        this.upperId = upperId;
    }

    public Integer getArctypeSort() {
        return arctypeSort;
    }

    public void setArctypeSort(Integer arctypeSort) {
        this.arctypeSort = arctypeSort;
    }

    public String getArctypePic() {
        return arctypePic;
    }

    public void setArctypePic(String arctypePic) {
        this.arctypePic = arctypePic == null ? null : arctypePic.trim();
    }

    public String getCarouselImage() {
        return carouselImage;
    }

    public void setCarouselImage(String carouselImage) {
        this.carouselImage = carouselImage == null ? null : carouselImage.trim();
    }

    public String getBelongClassName() {
        return belongClassName;
    }

    public void setBelongClassName(String belongClassName) {
        this.belongClassName = belongClassName == null ? null : belongClassName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getArctypeDescribe() {
        return arctypeDescribe;
    }

    public void setArctypeDescribe(String arctypeDescribe) {
        this.arctypeDescribe = arctypeDescribe == null ? null : arctypeDescribe.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}