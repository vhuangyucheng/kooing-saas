package com.kooing.model.mysql.shop;

public class TbShopWithBLOBs extends TbShop {
    private String storeZy;

    private String storeSlide;

    private String storeSlideUrl;

    private String storePresales;

    private String storeAftersales;

    public String getStoreZy() {
        return storeZy;
    }

    public void setStoreZy(String storeZy) {
        this.storeZy = storeZy == null ? null : storeZy.trim();
    }

    public String getStoreSlide() {
        return storeSlide;
    }

    public void setStoreSlide(String storeSlide) {
        this.storeSlide = storeSlide == null ? null : storeSlide.trim();
    }

    public String getStoreSlideUrl() {
        return storeSlideUrl;
    }

    public void setStoreSlideUrl(String storeSlideUrl) {
        this.storeSlideUrl = storeSlideUrl == null ? null : storeSlideUrl.trim();
    }

    public String getStorePresales() {
        return storePresales;
    }

    public void setStorePresales(String storePresales) {
        this.storePresales = storePresales == null ? null : storePresales.trim();
    }

    public String getStoreAftersales() {
        return storeAftersales;
    }

    public void setStoreAftersales(String storeAftersales) {
        this.storeAftersales = storeAftersales == null ? null : storeAftersales.trim();
    }
}