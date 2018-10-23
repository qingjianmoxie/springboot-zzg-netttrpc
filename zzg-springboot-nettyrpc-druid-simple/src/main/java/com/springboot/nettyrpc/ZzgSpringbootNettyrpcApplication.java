package com.springboot.nettyrpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.springboot.nettyrpc.dao.mapper")
public class ZzgSpringbootNettyrpcApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZzgSpringbootNettyrpcApplication.class, args);
	}
}
