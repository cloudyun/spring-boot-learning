package com.fhzz.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhzz.vo.People;

@RestController
@RequestMapping("/people")
@EnableConfigurationProperties(People.class)
public class PeopelControl {

	@Autowired
	People people;

	@Value("${people.name}")
	private String name;

	@Value("${people.sex}")
	private String sex;

	@Value("${people.age}")
	private String age;

	@RequestMapping("/hello")
	public String hello() {
		return "我的名字叫" + name + ",我是" + sex + "生,今年" + age + "岁了!";
	}

	@RequestMapping("/ts")
	public String toString() {
		return "我的名字叫" + people.getName() + ",我是" + people.getSex() + "生,今年" + people.getAge() + "岁了!";
	}
}