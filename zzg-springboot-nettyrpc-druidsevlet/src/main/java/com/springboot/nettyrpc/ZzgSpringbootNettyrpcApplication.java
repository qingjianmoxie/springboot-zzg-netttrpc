package com.springboot.nettyrpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.springboot.nettyrpc.dao.mapper")
@ServletComponentScan //像这样http://127.0.0.1:8084/druid/index.html访问druid的监控平台
public class ZzgSpringbootNettyrpcApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZzgSpringbootNettyrpcApplication.class, args);
	}
}
