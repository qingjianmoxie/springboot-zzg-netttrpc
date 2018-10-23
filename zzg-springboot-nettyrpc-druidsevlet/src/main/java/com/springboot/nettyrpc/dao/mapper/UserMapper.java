package com.springboot.nettyrpc.dao.mapper;

import java.util.List;

import com.springboot.nettyrpc.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> selectUserList();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}