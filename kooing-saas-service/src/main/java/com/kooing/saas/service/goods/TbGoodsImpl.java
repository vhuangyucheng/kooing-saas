package com.kooing.saas.service.goods;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.PageUtil;
import com.kooing.framework.param.common.response.Pagination;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.api.goods.TbGoodsApi;
import com.kooing.saas.persistent.dao.goods.TbGoodsMapper;
import com.kooing.saas.persistent.model.goods.TbGoods;
import com.kooing.saas.persistent.model.goods.request.TbGoodsReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author : kooing
 * @date : 2017/11/9 - 21:02
 * @desription :TbGoods接口实现类
 * @update by :
 */
@Slf4j
@Service(value = "tbGoodsImpl")
public class TbGoodsImpl implements TbGoodsApi {
    @Autowired
    TbGoodsMapper tbGoodsMapper;


    @Override
    public CommResp<List<TbGoods>> goodsList(DataReq<TbGoodsReq> data) throws Exception {
        PageUtil.startPage(data);
        List<TbGoods> list = tbGoodsMapper.getGoodsList(data.getBody());
        Pagination pagination = new Pagination(list);
        return new SuccessResp<List<TbGoods>>("0", "ok", pagination, list);
    }

    @Override
    public CommResp<Object> deleteGoods(DataReq<TbGoods> data) throws Exception {
        tbGoodsMapper.deleteByPrimaryKey(data.getBody().getGoodsId());
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> updateGoods(DataReq<TbGoods> data) throws Exception {
        tbGoodsMapper.updateByPrimaryKeySelective(data.getBody());
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> addGoods(DataReq<TbGoods> data) throws Exception {
        TbGoods tbGoods = data.getBody();
        tbGoods.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        tbGoods.setGoodsTime(new Date(System.currentTimeMillis()));
        tbGoodsMapper.insertSelective(tbGoods);
        return new SuccessResp<Object>(null);
    }
}
