package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DevopsController {
	@GetMapping(path="/mag")
	public String hai() {
		return "HelloWorld";
	}
	

}
