package com.yy.service;

import java.util.List;

import com.yy.entity.Todo;

public interface TodoService {
	
	void save(Todo t,int uid);
	
	Todo fetch(int tid);
	
	void remove(int tid);
	
	List<Todo> findByUser(int uid);
	
	List<Todo> findByStatus(int tid);
	
	void update(int tid);

}
