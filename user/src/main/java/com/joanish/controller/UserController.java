package com.joanish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joanish.entity.ProductEntity;
import com.joanish.service.ProductService;

@RestController
public class UserController {
	@Autowired
	ProductService prodService;
	
	@GetMapping("/listprod")
	public List<ProductEntity> getprod(){
		return prodService.listuser();
	}

	@PostMapping("/saveprod")
	public void saveprod(@RequestBody ProductEntity productEntity) {
		prodService.saveprod(productEntity);
	}
	
	@GetMapping("/deleteprodbyid/{id}")
	public void delete(@PathVariable Integer id) {
		prodService.deleteproduct(id);
	}
	
	@GetMapping("/deletename/{pname}")
	public void deleted(@PathVariable String pname) {
		prodService.deleteproductbyname(pname);
	}
}