package com.wlu.newstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.wlu.newstart"})
public class NewstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewstartApplication.class, args);
	}

}
