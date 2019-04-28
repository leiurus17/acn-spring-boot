package com.devcon.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

	//@ResponseBody
	@RequestMapping("hello")
	public String index() {
		return "Hello, Spring Boot! :)";
	}

}
