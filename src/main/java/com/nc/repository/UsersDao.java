package com.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.entity.Users;

public interface UsersDao extends JpaRepository<Users, Long>{
}
