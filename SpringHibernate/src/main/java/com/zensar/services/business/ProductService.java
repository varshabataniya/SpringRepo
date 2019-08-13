package com.zensar.services.business;

import java.util.List;


import com.zensar.entities.Product;

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

public interface ProductService {
	
	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();
}
