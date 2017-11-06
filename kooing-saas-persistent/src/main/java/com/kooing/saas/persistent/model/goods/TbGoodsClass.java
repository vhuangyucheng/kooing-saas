package com.kooing.saas.persistent.model.goods;

public class TbGoodsClass {
    private Integer gcId;

    private String uuid;

    private String gcName;

    private Integer gcParentId;

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
    }

    public Integer getGcParentId() {
        return gcParentId;
    }

    public void setGcParentId(Integer gcParentId) {
        this.gcParentId = gcParentId;
    }
}