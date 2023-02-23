package com.joanish.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Integer id;
		
	Integer cartid;
	
	@ManyToOne(targetEntity = ProductEntity.class,cascade = CascadeType.ALL,fetch =FetchType.LAZY)
	@JoinColumn(name="product_id",referencedColumnName = "pid")
	List<ProductEntity> products;
}
