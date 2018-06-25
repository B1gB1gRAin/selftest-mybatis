package com.bigbigrain.mybatis.dao;

import java.util.List;

import com.bigbigrain.mybatis.pojo.User;

public interface UserDao {

	public User findUserById(Integer id);
	
	public List<User> findUserByUserName(String userName);
}
