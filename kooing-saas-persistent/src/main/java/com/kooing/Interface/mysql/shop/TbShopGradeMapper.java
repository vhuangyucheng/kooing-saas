package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopGrade;

public interface TbShopGradeMapper {
    int deleteByPrimaryKey(Integer sgId);

    int insert(TbShopGrade record);

    int insertSelective(TbShopGrade record);

    TbShopGrade selectByPrimaryKey(Integer sgId);

    int updateByPrimaryKeySelective(TbShopGrade record);

    int updateByPrimaryKey(TbShopGrade record);
}