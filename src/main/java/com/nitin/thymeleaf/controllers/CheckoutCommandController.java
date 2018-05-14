package com.nitin.thymeleaf.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nitin.thymeleaf.command.CheckoutCommand;

@Controller
public class CheckoutCommandController {

	@GetMapping("/checkout")
	public String retrieveCheckout(Model model) {
		model.addAttribute("checkoutCommand", new CheckoutCommand());
		return "checkoutForm";
	}
	
	@PostMapping("/doCheckout")
	public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "checkoutForm";
		}
		return "checkoutComplete";
	}
}
