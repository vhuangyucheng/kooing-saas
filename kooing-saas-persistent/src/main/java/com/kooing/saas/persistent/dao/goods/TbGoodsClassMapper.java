package com.kooing.saas.persistent.dao.goods;

import com.kooing.saas.persistent.model.goods.TbGoods;
import com.kooing.saas.persistent.model.goods.TbGoodsClass;
import com.kooing.saas.persistent.model.goods.response.TbGoodsClassResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbGoodsClassMapper {
    int deleteByPrimaryKey(Integer gcId);

    int insert(TbGoodsClass record);

    int insertSelective(TbGoodsClass record);

    TbGoodsClass selectByPrimaryKey(Integer gcId);

    int updateByPrimaryKeySelective(TbGoodsClass record);

    int updateByPrimaryKey(TbGoodsClass record);

    List<TbGoodsClassResp> getTbGoodsClassParentList(@Param("storeId")Integer storeId);

    List<TbGoodsClassResp> getTbGoodsClassChildList(@Param("gcId") Integer gcId, @Param("storeId") Integer storeId);
}