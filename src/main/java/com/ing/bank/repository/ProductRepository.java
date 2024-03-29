package com.ing.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.bank.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
