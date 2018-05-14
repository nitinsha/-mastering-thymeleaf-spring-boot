package com.nitin.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nitin.thymeleaf.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public String retriveProduct() {
		return "redirect:/index";
	}
	
	@GetMapping("/product/{id}")
	public String retriveProductById(@PathVariable Integer id, Model model) {
		model.addAttribute("product", productService.retrieveProduct(id));
		return "product";
	}
}
