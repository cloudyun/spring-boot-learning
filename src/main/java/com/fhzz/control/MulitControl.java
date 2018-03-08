package com.fhzz.control;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mulit")
public class MulitControl {

	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello world!";
	}

	@RequestMapping("/{type}")
	public @ResponseBody String type(@PathVariable("type") String type) {
		return "Hello world! this type is " + type;
	}
	
	@RequestMapping("")
	public @ResponseBody String test(@RequestParam String param) {
		return "param is " + param;
	}
}