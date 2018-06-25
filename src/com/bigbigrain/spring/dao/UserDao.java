package com.bigbigrain.spring.dao;

import java.util.List;

import com.bigbigrain.spring.pojo.User;

public interface UserDao {

	public User findUserById(Integer id);
	
	public List<User> findUserByUserName(String userName);
}
