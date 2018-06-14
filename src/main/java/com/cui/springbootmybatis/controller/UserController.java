package com.cui.springbootmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cui.springbootmybatis.model.User;
import com.cui.springbootmybatis.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userServiceImpl;
	
	@RequestMapping("/getuser")
	@ResponseBody
	public List<User> getUser() {
		List<User> userList= userServiceImpl.getUser();
		return userList;
	} 
}
