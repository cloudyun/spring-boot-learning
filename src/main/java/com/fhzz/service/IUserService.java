package com.fhzz.service;

import java.util.List;

import com.fhzz.vo.User;

public interface IUserService {

	User getUserById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Integer id, User user);

	public int delete(Integer id);
}