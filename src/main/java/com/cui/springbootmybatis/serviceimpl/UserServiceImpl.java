package com.cui.springbootmybatis.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cui.springbootmybatis.dao.UserDao;
import com.cui.springbootmybatis.model.User;
import com.cui.springbootmybatis.service.UserService;


@Service
public class UserServiceImpl implements UserService{

//	@Autowired
//	UserDao userDao;
//	
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null; 
	}

}
