package com.zhangdh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//启用定时任务
@EnableScheduling
public class SpringbootApplication {

	public static void main(String[] args) {
		System.out.println("The service to start.");
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("The service has started.");
	}
}
