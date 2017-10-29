package com.kooing.model.mysql.goods;

public class TbGoodsCommonWithBLOBs extends TbGoodsCommon {
    private String goodsBody;

    private String mobileBody;

    public String getGoodsBody() {
        return goodsBody;
    }

    public void setGoodsBody(String goodsBody) {
        this.goodsBody = goodsBody == null ? null : goodsBody.trim();
    }

    public String getMobileBody() {
        return mobileBody;
    }

    public void setMobileBody(String mobileBody) {
        this.mobileBody = mobileBody == null ? null : mobileBody.trim();
    }
}