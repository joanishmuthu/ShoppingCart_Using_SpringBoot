package com.joanish.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joanish.entity.Cart;
import com.joanish.entity.ProductEntity;
import com.joanish.repository.CartRepo;
import com.joanish.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepo;

	@Autowired
	CartRepo cartRepo;
	
	@Override
	public List<ProductEntity> listuser() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void saveprod(ProductEntity prod) {
		productRepo.save(prod);
	}

	@Override
	public void deleteproduct(Integer id) {
		productRepo.deleteById(id);
	}

	@Override
	public void deleteproductbyname(String pname) {
		// TODO Auto-generated method stub
		productRepo.deleteBypname(pname);
	}



	@Override
	public List<ProductEntity> fetchcart(Integer id) {
		List<ProductEntity> summa=cartRepo.findByproducts(id);
		return cartRepo.findByproducts(id);
	}

	@Override
	public void addcart(Integer id, Integer cartid, List<ProductEntity> products) {
		// TODO Auto-generated method stub
		cartRepo.savecart(id,cartid,products);
	}
	
	

}
