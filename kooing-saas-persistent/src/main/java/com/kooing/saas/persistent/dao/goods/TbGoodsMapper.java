package com.kooing.saas.persistent.dao.goods;

import com.kooing.saas.persistent.model.goods.TbGoods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbGoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);

    List<TbGoods> getGoodsList(@Param("TbGoods") TbGoods tbGoods, @Param("orderBy") String orderBy, @Param("desc") String desc);
}