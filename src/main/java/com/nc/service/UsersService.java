package com.nc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.entity.Users;
import com.nc.repository.UsersDao;

@Service
public class UsersService {
	@Autowired
	private UsersDao usersDao;
	
	public List<Users> findAll() {
		return usersDao.findAll();
	}
	
	public Users findById(Long id){
		Users users = usersDao.findById(id).get();
		return users;
	}
}
