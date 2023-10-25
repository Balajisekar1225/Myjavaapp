package com.myapp.MyJavaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJavaApp {
	@GetMapping(value = "/admin")
	public String addvalue() {
		return "Hello world";
	}

}
