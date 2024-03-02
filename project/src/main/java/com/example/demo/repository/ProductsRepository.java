package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
 @Procedure(procedureName = "products_search")
  List<Product> dbProductsearch(@Param("search_text") String  serachText);
}
