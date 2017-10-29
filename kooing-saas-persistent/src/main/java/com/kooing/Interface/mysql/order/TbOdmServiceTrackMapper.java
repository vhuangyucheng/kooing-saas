package com.kooing.Interface.mysql.order;

import com.kooing.model.mysql.order.TbOdmServiceTrack;

public interface TbOdmServiceTrackMapper {
    int deleteByPrimaryKey(Integer trackId);

    int insert(TbOdmServiceTrack record);

    int insertSelective(TbOdmServiceTrack record);

    TbOdmServiceTrack selectByPrimaryKey(Integer trackId);

    int updateByPrimaryKeySelective(TbOdmServiceTrack record);

    int updateByPrimaryKey(TbOdmServiceTrack record);
}