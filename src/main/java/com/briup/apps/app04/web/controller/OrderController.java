package com.briup.apps.app04.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@GetMapping("/findAll")
	public String findAll() {
		return "findAll";
	}

}
