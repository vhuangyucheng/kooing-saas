package com.kooing.saas.service.order;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.framework.param.common.response.PageUtil;
import com.kooing.framework.param.common.response.Pagination;
import com.kooing.framework.param.common.response.SuccessResp;
import com.kooing.saas.api.order.TbOdmOrderApi;
import com.kooing.saas.persistent.dao.order.TbOdmOrderGoodsMapper;
import com.kooing.saas.persistent.dao.order.TbOdmOrderMapper;
import com.kooing.saas.persistent.model.order.TbOdmOrder;
import com.kooing.saas.persistent.model.order.TbOdmOrderGoods;
import com.kooing.saas.persistent.model.order.request.TbOdmOrderReq;
import com.kooing.saas.persistent.model.order.response.TbOdmOrderResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author : kooing
 * @date : 2017/11/14 - 22:26
 * @desription :
 * @update by :
 */
@Service(value = "tbOdmOrderImpl")
public class TbOdmOrderImpl implements TbOdmOrderApi {
    @Autowired
    TbOdmOrderMapper tbOdmOrderMapper;
    @Autowired
    TbOdmOrderGoodsMapper tbOdmOrderGoodsMapper;

    @Override
    public CommResp<List<TbOdmOrderResp>> getOrderList(DataReq<TbOdmOrderReq> data) throws Exception {
        PageUtil.startPage(data);
        List<TbOdmOrderResp> list = tbOdmOrderMapper.getOrderList(data.getBody());
        for(TbOdmOrderResp tbOdmOrderResp : list){
            //这里long转int了，可能以后会有bug
            List<TbOdmOrderGoods> tbOdmOrderGoods = tbOdmOrderGoodsMapper.getGoodsList(tbOdmOrderResp.getOrderId().intValue());
            tbOdmOrderResp.setGoodsList(tbOdmOrderGoods);
        }
        Pagination pagination = new Pagination(list);
        return new SuccessResp<List<TbOdmOrderResp>>(pagination, list);
    }

    @Override
    public CommResp<Object> addOrder(DataReq<TbOdmOrderReq> data) throws Exception {
        TbOdmOrderReq tbOdmOrderReq = data.getBody();
        tbOdmOrderReq.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        tbOdmOrderReq.setAddTime(new Date(System.currentTimeMillis()));
        //订单生成算法（时间戳+3位随机uuid）
        tbOdmOrderReq.setOrderSn(System.currentTimeMillis() + UUID.randomUUID().toString().substring(0,3));
        //添加订单
        tbOdmOrderMapper.insertSelective(tbOdmOrderReq);
        //添加商品到订单
        List<TbOdmOrderGoods> goodsList = tbOdmOrderReq.getGoodsList();
        for(TbOdmOrderGoods tbOdmOrderGoods : goodsList){
            tbOdmOrderGoods.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
            tbOdmOrderGoods.setOrderId(tbOdmOrderReq.getOrderSn());
            tbOdmOrderGoodsMapper.insertSelective(tbOdmOrderGoods);
        }
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> updateOrder(DataReq<TbOdmOrderReq> data) throws Exception {
        tbOdmOrderMapper.updateByPrimaryKeySelective(data.getBody());
        return new SuccessResp<Object>(null);
    }

    @Override
    public CommResp<Object> deleteOrder(DataReq<TbOdmOrderReq> data) throws Exception {
        TbOdmOrderReq tbOdmOrderReq = data.getBody();
        tbOdmOrderMapper.deleteByPrimaryKey(tbOdmOrderReq.getOrderId());
        List<TbOdmOrderGoods> goodsList = tbOdmOrderReq.getGoodsList();
        for( TbOdmOrderGoods tbOdmOrderGoods : goodsList){
            tbOdmOrderGoodsMapper.deleteByOrderSn(tbOdmOrderReq.getOrderSn());
        }
        return new SuccessResp<Object>(null);
    }
}
