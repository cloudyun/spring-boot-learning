package com.fhzz.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.fhzz.control", "com.fhzz.service.impl", "com.fhzz.dao.impl"})
public class BdapApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdapApplication.class, args);
	}
}
