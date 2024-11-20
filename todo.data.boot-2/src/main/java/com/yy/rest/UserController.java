package com.yy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.entity.User;
import com.yy.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
@Autowired
private UserService service;


@PostMapping("/save")
public String save(@RequestBody User u)
{
	service.save(u);
	return "User Saved.";
}

	@GetMapping("/fetch/{uid}")
	public User fetch(@PathVariable int uid)
	{
		return service.fetch(uid);
	}
   @DeleteMapping("/delete/{uid}")
   public String remove(@PathVariable int uid)
   {
	   service.remove(uid);
	   return "User Deleted";
   }
   
   @GetMapping("/list")
   public List<User> list()
   {
	   return service.list();
   }

}
