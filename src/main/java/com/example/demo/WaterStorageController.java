package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterStorageController {

	@GetMapping("/")
	public String index() {
		return "Aplikace bezi..., default endpoint.";
	}
	
	@GetMapping("/heartbeat")
	public boolean heartbeat() {
		return true;
	}
	
	
}
