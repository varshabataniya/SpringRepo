package com.zensar.spring;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbConfig.xml");
		Product product = new Product(1005,"Laptop","Acer",40000);
		ProductService service = ctx.getBean("productServiceImpl", ProductService.class);
//		service.create(product1);
		
		product  = service.findProductById(6007);
		System.out.println(product);
		
		/*Product product1 = new Product(1002,"Laptop","Apple",70000);
		service.edit(product1);
		
		Product product2 = new Product();
		product.setProductId(1001);
		service.remove(product2);*/
		
		/*List<Product> productList = service.findAllProducts();
		for(Product p: productList)
			System.out.println(p);*/
	}
	
}
