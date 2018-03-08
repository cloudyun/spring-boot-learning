package com.fhzz.user;

import com.alibaba.fastjson.JSONObject;
import com.fhzz.util.Spider;
import com.fhzz.vo.User;

public class UserRestFull {

	
	public static void main(String[] args) {
//		get(5);
//		delete(5);
	}
	
	public static void get(int id) {
		String url = "http://localhost:8080/user/" + id;
		System.out.println(Spider.get(url));
	}
	
	public static void add() {
		String url = "http://localhost:8080/user/add";
		User user = new User();
		user.setUsername("肖七");
		user.setAge(26);
		String body = JSONObject.toJSONString(user);
		System.out.println(Spider.post(url, body));
	}
	
	public static void update() {
		String url = "http://localhost:8080/user/update/4";
		User user = new User();
		user.setUsername("胡六");
		user.setAge(16);
		String body = JSONObject.toJSONString(user);
		System.out.println(Spider.put(url, body));
	}
	
	public static void delete(int id) {
		String url = "http://localhost:8080/user/delete/" + id;
		System.out.println(Spider.delete(url));
	}
	
}
