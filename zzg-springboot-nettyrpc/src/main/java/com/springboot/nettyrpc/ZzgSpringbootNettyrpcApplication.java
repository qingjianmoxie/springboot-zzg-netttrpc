package com.springboot.nettyrpc;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.springboot.nettyrpc.dao.mapper")
public class ZzgSpringbootNettyrpcApplication {
	
	    @Bean  
	    @ConfigurationProperties("spring.datasource.druid")  
	    public DataSource dataSource() {  
	        return DruidDataSourceBuilder.create().build();  
	    }  

	public static void main(String[] args) {
		SpringApplication.run(ZzgSpringbootNettyrpcApplication.class, args);
	}
}
