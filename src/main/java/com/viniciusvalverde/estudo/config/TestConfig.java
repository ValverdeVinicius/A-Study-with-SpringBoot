package com.viniciusvalverde.estudo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciusvalverde.estudo.entities.Category;
import com.viniciusvalverde.estudo.entities.Order;
import com.viniciusvalverde.estudo.entities.User;
import com.viniciusvalverde.estudo.entities.enums.OrderStatus;
import com.viniciusvalverde.estudo.repositories.CategoryRepository;
import com.viniciusvalverde.estudo.repositories.OrderRepository;
import com.viniciusvalverde.estudo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category ca1 = new Category(null, "Electronics");
		Category ca2 = new Category(null, "Books");
		Category ca3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(ca1, ca2, ca3));
		
		User u1 = new User(null, "Maria da Silva", "maria@gmail.com", "98888888", "password");
		User u2 = new User(null, "Vinícius Valverde", "vinicius@gmail.com", "99999999", "senha");
		
		Order o1 = new Order(null, Instant.parse("2023-06-25T18:50:03Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-05-16T11:15:18Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2021-08-09T08:34:26Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}	
}