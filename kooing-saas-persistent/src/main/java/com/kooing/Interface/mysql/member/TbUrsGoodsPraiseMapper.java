package com.kooing.Interface.mysql.member;

import com.kooing.model.mysql.member.TbUrsGoodsPraise;

public interface TbUrsGoodsPraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUrsGoodsPraise record);

    int insertSelective(TbUrsGoodsPraise record);

    TbUrsGoodsPraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUrsGoodsPraise record);

    int updateByPrimaryKey(TbUrsGoodsPraise record);
}