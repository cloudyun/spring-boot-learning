package com.fhzz.vo;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/people/people.properties")
@ConfigurationProperties(prefix="people")
public class People implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3153200847102961563L;

	private String name;
	
	private String sex;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}