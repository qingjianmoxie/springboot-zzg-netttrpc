package com.zzg.springcloud.zk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zzg.springcloud.zk.entity.User;
import com.zzg.springcloud.zk.service.IDiscoveryClientService;
import com.zzg.springcloud.zk.service.UserService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private IDiscoveryClientService discoveryClientService;
	
	  @RequestMapping("/")
	    public String home() {
	        return "Hello world";
	    }
	  
	  @RequestMapping("/getDiscoveryClientService")
	    public String getDiscoveryClientService() {
	        return discoveryClientService.serviceUrl();
	    }
	
	@RequestMapping(value="/selectUserList",method=RequestMethod.GET)
	public  List<User> selectUserList(){
		return userService.selectUserList();
	}

}
