package com.joanish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joanish.entity.Cart;
import com.joanish.entity.ProductEntity;
import com.joanish.repository.CartRepo;
import com.joanish.service.ProductService;

@RestController
public class CartController {
	
	@Autowired
	ProductService userService;
	
	@PostMapping("/addcart")
	public void addcart(@RequestBody Cart cart) {
		userService.addcart(cart.getId(),cart.getCartid(),cart.getProducts());
	}
	
	@Autowired
	CartRepo cartRepo;
	
	@GetMapping("/carts")
	public void showcart() {
		cartRepo.findAll();
	}
	
	@GetMapping("/fetchcart/{id}")
	public List<ProductEntity> fetchcart(@PathVariable Integer id){
		return userService.fetchcart(id);
	}
}
