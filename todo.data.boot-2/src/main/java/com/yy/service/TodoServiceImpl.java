package com.yy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yy.entity.Todo;
import com.yy.entity.User;
import com.yy.repo.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository repo;
	
	@Autowired
	private UserService service;
	
	
	
	@Override
	public void save(Todo t,int uid) {
		// TODO Auto-generated method stub

		User u= service.fetch(uid);
			t.setUser(u);
			repo.save(t);
		
	}

	@Override
	public Todo fetch(int tid) {
		// TODO Auto-generated method stub
		return repo.findById(tid).get();
	}

	@Override
	public void remove(int tid) {
		// TODO Auto-generated method stub

		repo.deleteById(tid);
	}

	@Override
	public List<Todo> findByUser(int uid) {
		// TODO Auto-generated method stub
//		return repo.findByUser(uid);
		return null;
	}

	@Override
	public List<Todo> findByStatus(int tid) {
		// TODO Auto-generated method stub
		return repo.findByStatus(tid);
	}

	@Override
	public void update(int tid) {
		// TODO Auto-generated method stub
		Todo t= repo.findById(tid).get();
		t.setStatus("completed");
		repo.save(t);
	}

}
