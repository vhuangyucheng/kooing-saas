package com.kooing.model.mysql.cms;

import java.util.Date;

public class TbCmsWorker {
    private Integer workerId;

    private String uuid;

    private Integer appId;

    private String workerName;

    private String workerPic;

    private Integer arctinyId;

    private Integer workerSort;

    private String workPosition;

    private String belongClassName;

    private Date updateTime;

    private Integer arctypeId;

    private String workerIntro;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
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

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public String getWorkerPic() {
        return workerPic;
    }

    public void setWorkerPic(String workerPic) {
        this.workerPic = workerPic == null ? null : workerPic.trim();
    }

    public Integer getArctinyId() {
        return arctinyId;
    }

    public void setArctinyId(Integer arctinyId) {
        this.arctinyId = arctinyId;
    }

    public Integer getWorkerSort() {
        return workerSort;
    }

    public void setWorkerSort(Integer workerSort) {
        this.workerSort = workerSort;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition == null ? null : workPosition.trim();
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

    public Integer getArctypeId() {
        return arctypeId;
    }

    public void setArctypeId(Integer arctypeId) {
        this.arctypeId = arctypeId;
    }

    public String getWorkerIntro() {
        return workerIntro;
    }

    public void setWorkerIntro(String workerIntro) {
        this.workerIntro = workerIntro == null ? null : workerIntro.trim();
    }
}