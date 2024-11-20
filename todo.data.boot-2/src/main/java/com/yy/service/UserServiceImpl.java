package com.yy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.entity.User;
import com.yy.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	
	
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub

		repo.save(u);
		
		
	}

	@Override
	public User fetch(int uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).get();
				
	}

	@Override
	public void remove(int uid) {
		// TODO Auto-generated method stub

		repo.deleteById(uid);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
