package com.yy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.entity.Todo;
import com.yy.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@PostMapping("/save/{uid}")
	public String save(@RequestBody Todo t,@PathVariable int uid)
	{
		service.save(t, uid);
		return "Todo Saved.";
	}
	
	@GetMapping("/fetch/{tid}")
	public Todo fetch(@PathVariable int tid)
	{
		return service.fetch(tid);
	}
	
	@DeleteMapping("/delete/{tid}")
	public String remove(@PathVariable int tid)
	{
		service.remove(tid);
		return "Todo deleted";
	}
	
	@GetMapping("/list/{uid}")
	public List<Todo> findByUser(@PathVariable int uid)
	{
		return service.findByUser(uid);
	}
	
	@GetMapping("/list/{tid}")
	public List<Todo>findByStatus(@PathVariable int tid)
	{
		return service.findByStatus(tid);
	}
	
	@PutMapping("/update/{tid}")
	public String updateStatus(@PathVariable int tid)
	{
		service.update(tid);
		return"Status updated";
	}

}
