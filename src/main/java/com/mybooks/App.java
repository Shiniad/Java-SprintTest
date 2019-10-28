package com.mybooks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybooks.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class App {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testSelectAll() throws Exception {
		userMapper.selectAll().forEach(System.out::println);
	}
}
