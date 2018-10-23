package com.zzg.springcloud.zk;

import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.zzg.springcloud.zk.entity.Constant;
@SpringBootApplication  
@EnableDiscoveryClient(autoRegister=false)	// 如果自己写服务发现，最后把这个设置成false,否则启动报错
public class ZzgSpringcloudZookeeperApplication {

	public static void main(String[] args) throws Exception {
		//服务发现的时候用的
		System.setProperty("spring.cloud.zookeeper.connect-string", Constant.connectString);
		System.setProperty("spring.cloud.zookeeper.discovery.instanceHost",InetAddress.getLocalHost().getHostAddress().toString());
		System.setProperty("server.port","8089");
		SpringApplication.run(ZzgSpringcloudZookeeperApplication.class, args);
	}
}
