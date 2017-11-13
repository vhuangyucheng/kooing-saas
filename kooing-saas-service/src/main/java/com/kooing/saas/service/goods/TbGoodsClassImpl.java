package com.kooing.saas.service.goods;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.api.goods.TbGoodsClassApi;
import com.kooing.saas.persistent.dao.goods.TbGoodsClassMapper;
import com.kooing.saas.persistent.model.goods.TbGoodsClass;
import com.kooing.saas.persistent.model.goods.response.TbGoodsClassResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * @author : kooing
 * @date : 2017/11/13 - 12:46
 * @desription : 实现TbGoodsClassApi接口
 * @update by :
 */
@Slf4j
@Service(value = "tbGoodsClassImpl")
public class TbGoodsClassImpl implements TbGoodsClassApi {
    @Autowired
    TbGoodsClassMapper tbGoodsClassMapper;

    @Override
    public CommResp<List<TbGoodsClassResp>> getGoodsClassList(DataReq<TbGoodsClass> data) throws Exception {
        List<TbGoodsClassResp> list = tbGoodsClassMapper.getTbGoodsClassParentList(data.getBody().getStoreId());
        log.info((list.get(1) instanceof TbGoodsClassResp) + "");
        log.info((list.get(1) instanceof TbGoodsClass) + "");
        for(TbGoodsClassResp tbGoodsClassResp : list){
            tbGoodsClassResp.setChildList(tbGoodsClassMapper.getTbGoodsClassChildList(tbGoodsClassResp.getGcId(), data.getBody().getStoreId()));
        }
        return new SuccessResp<List<TbGoodsClassResp>>(list);
    }

    @Override
    public CommResp<Object> addGoodsClass(DataReq<TbGoodsClass> data) throws Exception {
        TbGoodsClass tbGoodsClass = data.getBody();
        tbGoodsClass.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        tbGoodsClassMapper.insertSelective(tbGoodsClass);
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> updateGoodsClass(DataReq<TbGoodsClass> data) throws Exception {
        tbGoodsClassMapper.updateByPrimaryKeySelective(data.getBody());
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> deleteGoodsClass(DataReq<TbGoodsClass> data) throws Exception {
        tbGoodsClassMapper.deleteByPrimaryKey(data.getBody().getGcId());
        return new SuccessResp<Object>(null);
    }
}
