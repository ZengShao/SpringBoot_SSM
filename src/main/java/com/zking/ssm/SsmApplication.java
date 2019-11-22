package com.zking.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.zking.ssm.mapper")
@SpringBootApplication
@EnableCaching
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
	}

}
