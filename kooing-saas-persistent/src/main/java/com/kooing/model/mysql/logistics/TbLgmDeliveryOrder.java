package com.kooing.model.mysql.logistics;

import java.util.Date;

public class TbLgmDeliveryOrder {
    private Integer orderId;

    private String uuid;

    private Integer appId;

    private Date addtime;

    private String orderSn;

    private Integer dlypId;

    private String shippingCode;

    private String expressCode;

    private String expressName;

    private String reciverName;

    private String reciverTelphone;

    private String reciverMobphone;

    private Integer dlyoState;

    private String dlyoPickupCode;

    private Date updateTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getDlypId() {
        return dlypId;
    }

    public void setDlypId(Integer dlypId) {
        this.dlypId = dlypId;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode == null ? null : expressCode.trim();
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    public String getReciverName() {
        return reciverName;
    }

    public void setReciverName(String reciverName) {
        this.reciverName = reciverName == null ? null : reciverName.trim();
    }

    public String getReciverTelphone() {
        return reciverTelphone;
    }

    public void setReciverTelphone(String reciverTelphone) {
        this.reciverTelphone = reciverTelphone == null ? null : reciverTelphone.trim();
    }

    public String getReciverMobphone() {
        return reciverMobphone;
    }

    public void setReciverMobphone(String reciverMobphone) {
        this.reciverMobphone = reciverMobphone == null ? null : reciverMobphone.trim();
    }

    public Integer getDlyoState() {
        return dlyoState;
    }

    public void setDlyoState(Integer dlyoState) {
        this.dlyoState = dlyoState;
    }

    public String getDlyoPickupCode() {
        return dlyoPickupCode;
    }

    public void setDlyoPickupCode(String dlyoPickupCode) {
        this.dlyoPickupCode = dlyoPickupCode == null ? null : dlyoPickupCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}