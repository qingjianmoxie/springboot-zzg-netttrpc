package com.zzg.springcloud.zk.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzg.springcloud.zk.entity.User;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> selectUserList();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}