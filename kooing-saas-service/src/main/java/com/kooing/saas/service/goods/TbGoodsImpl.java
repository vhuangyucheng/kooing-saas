package com.kooing.saas.service.goods;

import com.kooing.framework.param.common.request.DataReq;
import com.kooing.framework.param.common.response.CommResp;
import com.kooing.saas.api.goods.TbGoodsApi;
import com.kooing.saas.persistent.dao.goods.TbGoodsMapper;
import com.kooing.saas.persistent.model.goods.TbGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : kooing
 * @date : 2017/11/9 - 21:02
 * @desription :TbGoods接口实现类
 * @update by :
 */
@Slf4j
@Service(value = "TbGoodsImpl")
public class TbGoodsImpl implements TbGoodsApi {
    @Autowired
    TbGoodsMapper tbGoodsMapper;

    @Override
    public CommResp<List<TbGoods>> addGoods(DataReq<TbGoods> data) throws Exception {
        return null;
    }

    @Override
    public CommResp<List<TbGoods>> goodsList(DataReq<TbGoods> data) throws Exception {
        return null;
    }
}
