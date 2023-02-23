package com.joanish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joanish.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	public void deleteBypname(String pname);

}
