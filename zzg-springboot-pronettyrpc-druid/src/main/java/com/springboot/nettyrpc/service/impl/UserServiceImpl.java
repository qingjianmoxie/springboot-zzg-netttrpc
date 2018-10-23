package com.springboot.nettyrpc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.nettyrpc.dao.mapper.UserMapper;
import com.springboot.nettyrpc.entity.User;
import com.springboot.nettyrpc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectUserList() {
		return userMapper.selectUserList();
	}

}
