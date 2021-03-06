package com.bigbigrain.spring.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigbigrain.spring.mapper.UserMapper;
import com.bigbigrain.spring.pojo.User;
import com.bigbigrain.spring.pojo.UserExample;
import com.bigbigrain.spring.pojo.UserExample.Criteria;

public class SpringMapperTest {
	
	private ApplicationContext applicatonContext;
	
	@Before
	public void setUp() throws Exception{
		String configLocation = "classpath:spring/ApplicationContext.xml";
		applicatonContext = new ClassPathXmlApplicationContext(configLocation);
	}
	
//	@Test
//	public void  testFindUserById() throws Exception{
//		UserMapper userMapper = (UserMapper)applicatonContext.getBean("userMapper");
//		
//		User user = userMapper.findUserById(1);
//		System.out.println(user);
//	}
	
	@Test
	public void testFindUserById() throws Exception{
		UserMapper userMapper = (UserMapper)applicatonContext.getBean("userMapper");
		
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
	
	@Test
	public void testFindUserAndSex() throws Exception{
		UserMapper userMapper = (UserMapper)applicatonContext.getBean("userMapper");
		
		//创建UserExample对象
		UserExample userExample = new UserExample();
		//通过UserExample对象创建查询条件封装对象(Criteria中是封装的查询条件)
		Criteria createCriteria = userExample.createCriteria();
		
		//加入查询条件
		createCriteria.andUsernameLike("%王%");
		createCriteria.andSexEqualTo("1");
		
		List<User> list = userMapper.selectByExample(userExample);
		System.out.println(list);
	}
}
