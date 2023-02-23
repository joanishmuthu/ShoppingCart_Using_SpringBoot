package com.joanish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.joanish.entity.Cart;
import com.joanish.entity.ProductEntity;

import jakarta.transaction.Transactional;

public interface CartRepo extends JpaRepository<Cart, Integer> {

	@Query("Select e.pname,e.price from Cart c inner join ProductEntity e on c.products=e.pid where c.cartid=?1")
	public List<ProductEntity> findByproducts(Integer id);
	
	@Query("Insert into Cart values(?0,?1,?2)")
	public void savecart(Integer id,Integer cartid,List<ProductEntity> products);
}
