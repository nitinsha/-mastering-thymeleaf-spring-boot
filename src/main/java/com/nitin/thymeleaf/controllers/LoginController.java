package com.nitin.thymeleaf.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nitin.thymeleaf.command.LoginCommand;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String retrieveLoginPage(Model model) {
		model.addAttribute("loginCommand", new LoginCommand());
		return "loginForm";
	}

	@RequestMapping("logout-success")
	public String yourLoggedOut() {

		return "logout-success";
	}

	//@PostMapping("/doLogin")
	public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "loginForm";
		}
		return "redirect:index";
	}
	
	@GetMapping("/secured")
	public String secured() {
		return "secured.html";
	}
}
