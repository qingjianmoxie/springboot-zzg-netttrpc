package com.zzg.springcloud.zk.service;

import java.util.List;

import com.zzg.springcloud.zk.entity.User;


public interface UserService {

	 List<User> selectUserList();
	
}
