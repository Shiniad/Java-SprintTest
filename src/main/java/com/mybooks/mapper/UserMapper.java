package com.mybooks.mapper;

import java.util.List;

import com.mybooks.entity.User;

public interface UserMapper {
	int insert(User u);
	// FIXME
	int updateById(User u);

	int deleteById(Long id);

	User selectById(Long id);

	List<User> selectAll();
}
