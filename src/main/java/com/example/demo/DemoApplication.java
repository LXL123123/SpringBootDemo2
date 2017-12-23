package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Configuration
//@ComponentScans()
@EnableAutoConfiguration
@MapperScan(basePackages = "com.example.demo.mapper")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("DemoApplication is running...");
	}
}
