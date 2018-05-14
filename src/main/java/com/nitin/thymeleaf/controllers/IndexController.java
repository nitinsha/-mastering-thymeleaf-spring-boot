package com.nitin.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nitin.thymeleaf.service.ProductService;

@Controller
public class IndexController {

	@Autowired
	ProductService productService;
	
	@GetMapping({"/", "index"})
	public String retriveIndexScreen(Model model) {
	
		model.addAttribute("products", productService.retieveProducts());		
		return "index";
	}
	
	
}
