package com.joanish.service;

import java.util.List;

import com.joanish.entity.Cart;
import com.joanish.entity.ProductEntity;

public interface ProductService {
	public List<ProductEntity> listuser();
	
	public void saveprod(ProductEntity prod);

	public void deleteproduct(Integer id);

	public void deleteproductbyname(String pname);

	public List<ProductEntity> fetchcart(Integer id);

	public void addcart(Integer id, Integer cartid, List<ProductEntity> products);
}
