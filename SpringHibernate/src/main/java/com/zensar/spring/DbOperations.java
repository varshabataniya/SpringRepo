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
		Product product = new Product(1006,"Mobile","1+",40000);
		ProductService service = ctx.getBean("productServiceImpl", ProductService.class);
    	//service.create(product);
		
		/*product = service.findProductById(1006);
		System.out.println(product);*/
		
		/*Product product1 = new Product(1001,"Laptop","Apple",70000);
		service.edit(product1);*/
		
		/*Product product1 = new Product();
		product1.setProductId(6007);
		service.remove(product1);*/
		
		
		List<Product> productList = service.findAllProducts();
		for(Product p: productList)
			System.out.println(p);
	}
	
}
