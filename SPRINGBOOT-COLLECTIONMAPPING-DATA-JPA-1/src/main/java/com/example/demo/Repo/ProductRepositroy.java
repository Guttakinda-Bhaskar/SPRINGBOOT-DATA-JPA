package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Product;

@Repository
public interface ProductRepositroy extends CrudRepository<Product, Integer> {
	
}