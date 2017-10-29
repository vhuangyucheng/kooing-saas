package com.kooing.Interface.mysql.cms;

import com.kooing.model.mysql.cms.TbCmsWorker;

public interface TbCmsWorkerMapper {
    int deleteByPrimaryKey(Integer workerId);

    int insert(TbCmsWorker record);

    int insertSelective(TbCmsWorker record);

    TbCmsWorker selectByPrimaryKey(Integer workerId);

    int updateByPrimaryKeySelective(TbCmsWorker record);

    int updateByPrimaryKeyWithBLOBs(TbCmsWorker record);

    int updateByPrimaryKey(TbCmsWorker record);
}