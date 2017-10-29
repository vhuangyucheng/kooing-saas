package com.kooing.model.mysql.logistics;

import java.util.Date;

public class TbLgmExpress {
    private Integer id;

    private String uuid;

    private Integer appId;

    private String name;

    private Integer state;

    private String code;

    private String letter;

    private Integer isCommonUse;

    private String url;

    private Integer ztState;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter == null ? null : letter.trim();
    }

    public Integer getIsCommonUse() {
        return isCommonUse;
    }

    public void setIsCommonUse(Integer isCommonUse) {
        this.isCommonUse = isCommonUse;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getZtState() {
        return ztState;
    }

    public void setZtState(Integer ztState) {
        this.ztState = ztState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}