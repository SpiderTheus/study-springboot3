package com.spidertech.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spidertech.study.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
