package com.springboot.nettyrpc.service;

import java.util.List;

import com.springboot.nettyrpc.entity.User;

public interface UserService {

	 List<User> selectUserList();
	
}
