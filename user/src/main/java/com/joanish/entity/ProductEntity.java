package com.joanish.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int pid;
	
	public String pname;
	
	public int price;
	
	public ProductEntity() {
		
	}
}
