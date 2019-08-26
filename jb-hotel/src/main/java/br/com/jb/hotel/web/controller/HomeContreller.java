package br.com.jb.hotel.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContreller {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
