package com.xzk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

	@GetMapping("/oneTest")
	public String oneTest() {
		return "hello world";
	}
}
