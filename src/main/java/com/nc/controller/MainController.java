package com.nc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nc.entity.Users;
import com.nc.service.UsersService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("users")
public class MainController {
	
	@Autowired UsersService usersService;
	
	@GetMapping
	public List<Users> index() {
		return usersService.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Users users(@PathVariable("id") Long id) {
		return usersService.findById(id);
	}
}
