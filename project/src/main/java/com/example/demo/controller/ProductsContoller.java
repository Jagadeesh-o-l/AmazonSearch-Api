package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.pojo.searchProductpojo;
import com.example.demo.repository.ProductsRepository;

@RestController
public class ProductsContoller {

	@Autowired
	ProductsRepository repo;
	
	@Transactional
	@PostMapping("api/serach")
	public ResponseEntity<List<Product >> searchproducts(@RequestBody searchProductpojo apiData) {
		
		List<Product > list= repo.dbProductsearch(apiData.getSerachText());
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
}
