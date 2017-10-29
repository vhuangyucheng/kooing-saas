package com.kooing.model.mysql.foods;

public class TbFoodsProperty {
    private Long fpId;

    private String type;

    private String name;

    private String content;

    private Integer orderNum;

    private String extendfileds;

    private Long foodsId;

    private Integer appId;

    public Long getFpId() {
        return fpId;
    }

    public void setFpId(Long fpId) {
        this.fpId = fpId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getExtendfileds() {
        return extendfileds;
    }

    public void setExtendfileds(String extendfileds) {
        this.extendfileds = extendfileds == null ? null : extendfileds.trim();
    }

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
}