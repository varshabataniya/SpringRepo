package com.zensar.spring.daos;

import java.util.List;

import com.zensar.entities.Product;

public interface ProductDao{

	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
