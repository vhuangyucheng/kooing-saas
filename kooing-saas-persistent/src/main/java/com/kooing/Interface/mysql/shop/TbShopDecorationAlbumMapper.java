package com.kooing.Interface.mysql.shop;

import com.kooing.model.mysql.shop.TbShopDecorationAlbum;

public interface TbShopDecorationAlbumMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(TbShopDecorationAlbum record);

    int insertSelective(TbShopDecorationAlbum record);

    TbShopDecorationAlbum selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(TbShopDecorationAlbum record);

    int updateByPrimaryKey(TbShopDecorationAlbum record);
}