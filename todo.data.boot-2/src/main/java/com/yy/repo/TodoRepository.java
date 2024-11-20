package com.yy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yy.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
	
@Query("From Todo where user.uid :uid")
public List<Todo> findByUser(@Param (value = "uid") int uid);
	
	
	
	@Query("From Todo where tid= : tid")
	public List<Todo> findByStatus(@Param (value = "tid")  int tid);

}
