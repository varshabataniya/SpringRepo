package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entities.Product;
import com.zensar.spring.daos.ProductDao;

/*Author: Varsha B
 * Creation Date: 25th July 2019 5.00 PM
 * Modified Date: 30th July 2019 5.00 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents product services
 * which can be accessed by presentation layer.
 * It encapsulates business logic of product entity.
 * It's a POJO class;
 */

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null){
			dbProduct.setName(product.getName());
			dbProduct.setBrand(product.getBrand());
			dbProduct.setPrice(product.getPrice());
			dao.update(dbProduct);
		}else
			System.out.println("Sorry! Product does not exist");
	}

	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null){
			dao.delete(dbProduct);
		}else
			System.out.println("Sorrry no product");
	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
