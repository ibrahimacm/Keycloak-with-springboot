package com.codetech.authserver.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	@GetMapping(path = "/test")
	public String testPage() {
	        return "home";
	}
}
