package com.spidertech.study.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spidertech.study.entities.User;
import com.spidertech.study.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "maria", "maria@gmail.com", "06060606", "50315");
		User u2 = new User(null, "joao", "joao@gmail.com", "805351", "54586684");
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
