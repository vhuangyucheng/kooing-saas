package com.kooing.model.mysql.foods;

public class TbFoodsShare {
    private Long fsId;

    private Long foodsId;

    private Integer ftId;

    private Integer appId;

    public Long getFsId() {
        return fsId;
    }

    public void setFsId(Long fsId) {
        this.fsId = fsId;
    }

    public Long getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(Long foodsId) {
        this.foodsId = foodsId;
    }

    public Integer getFtId() {
        return ftId;
    }

    public void setFtId(Integer ftId) {
        this.ftId = ftId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}