package com.yy.service;

import java.util.List;

import com.yy.entity.User;

public interface UserService {
	
	void save(User u);
	
	User fetch(int uid);
	
	void remove(int uid);
	
	List<User> list();

}
