package com.kooing.model.mysql.shop;

import java.math.BigDecimal;

public class TbShopGrade {
    private Integer sgId;

    private String uuid;

    private Integer appId;

    private String sgName;

    private Integer sgGoodsLimit;

    private Integer sgAlbumLimit;

    private Integer sgSpaceLimit;

    private Integer sgTemplateNumber;

    private String sgTemplate;

    private BigDecimal sgPrice;

    private String sgDescription;

    private String sgFunction;

    private Integer sgSort;

    public Integer getSgId() {
        return sgId;
    }

    public void setSgId(Integer sgId) {
        this.sgId = sgId;
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

    public String getSgName() {
        return sgName;
    }

    public void setSgName(String sgName) {
        this.sgName = sgName == null ? null : sgName.trim();
    }

    public Integer getSgGoodsLimit() {
        return sgGoodsLimit;
    }

    public void setSgGoodsLimit(Integer sgGoodsLimit) {
        this.sgGoodsLimit = sgGoodsLimit;
    }

    public Integer getSgAlbumLimit() {
        return sgAlbumLimit;
    }

    public void setSgAlbumLimit(Integer sgAlbumLimit) {
        this.sgAlbumLimit = sgAlbumLimit;
    }

    public Integer getSgSpaceLimit() {
        return sgSpaceLimit;
    }

    public void setSgSpaceLimit(Integer sgSpaceLimit) {
        this.sgSpaceLimit = sgSpaceLimit;
    }

    public Integer getSgTemplateNumber() {
        return sgTemplateNumber;
    }

    public void setSgTemplateNumber(Integer sgTemplateNumber) {
        this.sgTemplateNumber = sgTemplateNumber;
    }

    public String getSgTemplate() {
        return sgTemplate;
    }

    public void setSgTemplate(String sgTemplate) {
        this.sgTemplate = sgTemplate == null ? null : sgTemplate.trim();
    }

    public BigDecimal getSgPrice() {
        return sgPrice;
    }

    public void setSgPrice(BigDecimal sgPrice) {
        this.sgPrice = sgPrice;
    }

    public String getSgDescription() {
        return sgDescription;
    }

    public void setSgDescription(String sgDescription) {
        this.sgDescription = sgDescription == null ? null : sgDescription.trim();
    }

    public String getSgFunction() {
        return sgFunction;
    }

    public void setSgFunction(String sgFunction) {
        this.sgFunction = sgFunction == null ? null : sgFunction.trim();
    }

    public Integer getSgSort() {
        return sgSort;
    }

    public void setSgSort(Integer sgSort) {
        this.sgSort = sgSort;
    }
}