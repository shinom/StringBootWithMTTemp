package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.master.User;
import com.example.model.tenant.Product;
import com.example.repository.master.UserRepository;
import com.example.repository.tenant.ProductRepository;

@RestController
@RequestMapping("/")
public class TestController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		List<User> users = userRepository.findAll();
		for (User user : users) {
			System.out.println(user.getName());
		}
		List<Product> products = productRepository.findAll();
		for (Product product : products) {
			System.out.println(product.getName());
		}
		return "Test";
	}
}
