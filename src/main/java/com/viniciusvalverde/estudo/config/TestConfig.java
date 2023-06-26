package com.viniciusvalverde.estudo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciusvalverde.estudo.entities.User;
import com.viniciusvalverde.estudo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria da Silva", "maria@gmail.com", "98888888", "password");
		User u2 = new User(null, "Vinícius Valverde", "vinicius@gmail.com", "99999999", "senha");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}	
}