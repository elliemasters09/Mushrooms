package com.example.mushroom;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String hello() {
		return "hello world";
	}

}
