package com.zzg.springcloud.zk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzg.springcloud.zk.dao.mapper.UserMapper;
import com.zzg.springcloud.zk.entity.User;
import com.zzg.springcloud.zk.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectUserList() {
		return userMapper.selectUserList();
	}

}
