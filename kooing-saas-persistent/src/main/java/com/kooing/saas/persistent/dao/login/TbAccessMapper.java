package com.kooing.saas.persistent.dao.login;

import com.kooing.saas.persistent.model.login.TbAccess;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbAccessMapper {
    int deleteByPrimaryKey(Integer accessId);

    int insert(TbAccess record);

    int insertSelective(TbAccess record);

    TbAccess selectByPrimaryKey(Integer accessId);

    int updateByPrimaryKeySelective(TbAccess record);

    int updateByPrimaryKey(TbAccess record);

    List<String> getUrlList(List<Integer> accessId);


    /**
     * @author      : kooing
     * @Date        : 2017/12/16 19:55
     * @Desription  : 新的多表链接查询，不把查询放在java
     * @return      :
     */
    List<String> getAccessUrl(Integer memberId);
}