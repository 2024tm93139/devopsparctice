package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomepageController {
	@ResponseBody
	@GetMapping(value = "/")
	public String getHomePage() {
		return "This is homepage.";
	}
}
