package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	@Id
	public int product_id;
	public String title;
	public String description;
	public float price;
	public String thumbnil_path;
	public int rating;
	public int in_stock;
	
	
	
	
	

}
