package com.fhzz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fhzz.dao.IUserDao;
import com.fhzz.service.IUserService;
import com.fhzz.vo.User;

@Service
public class UserServiceimpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public int update(Integer id, User user) {
		return userDao.update(id, user);
	}

	@Override
	public int delete(Integer id) {
		return userDao.delete(id);
	}
}
