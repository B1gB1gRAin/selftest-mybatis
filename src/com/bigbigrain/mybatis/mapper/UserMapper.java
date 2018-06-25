package com.bigbigrain.mybatis.mapper;

import java.util.List;

import com.bigbigrain.mybatis.pojo.CustomOrders;
import com.bigbigrain.mybatis.pojo.Orders;
import com.bigbigrain.mybatis.pojo.QueryVo;
import com.bigbigrain.mybatis.pojo.User;

public interface UserMapper {

	public User findUserById(Integer id);
	
	//动态代理形势中,如果返回结果集问List,那么mybatis会在生成实现类的使用会自动调用selectList方法
	public List<User> findUserByUserName(String userName);
	
	public void insertUser(User user);
	
	public List<User> findUserbyVo(QueryVo vo);
	
	public Integer findUserCount();
	
	public List<User> findUserByUserNameAndSex(User user);
	
	public List<User> findUserByIds(QueryVo vo);
	
	public List<CustomOrders> findOrdersAndUser1() ;
	
	public List<Orders> findOrdersAndUser2();
	
	public List<User> findUserAndOrders();
}
