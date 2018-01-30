package com.briup.apps.app04.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "/index.html";
	}

	@GetMapping("/login")
	public String login(Model model, @RequestParam(value = "error", required = false) String error) {
		if (error != null) {
			model.addAttribute("error", "用户名或密码错误");
		}
		return "forward:/login_page.html";
	}
}
