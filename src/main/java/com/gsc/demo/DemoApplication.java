package com.gsc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.gsc.demo.datasource.DynamicDataSourceRegister;

@SpringBootApplication
@MapperScan(basePackages="com.gsc.demo.mapper")
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
