package com.nitin.thymeleaf.service;

import java.util.List;

import com.nitin.thymeleaf.domain.Product;

public interface ProductService {

	Product retrieveProduct(Integer id);
	List<Product> retieveProducts();
}
