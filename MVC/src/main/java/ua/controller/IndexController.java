package ua.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping("/")
	public String showIndex(Principal principal) {
		System.out.println(principal);
		System.out.println(System.getProperty("catalina.home"));

		return "index";
	}

	@RequestMapping("/admin")
	public String showAdmin() {
		return "admin";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/cart")
	public String showCart() {
		return "cart";
	}
	
	@RequestMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
	

}
