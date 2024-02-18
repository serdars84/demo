package com.example.demomaven;

import jakarta.annotation.security.PermitAll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoMavenApplication {

	@PermitAll
	@GetMapping("/public")
	public String test() {
		return "public access allowed";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApplication.class, args);
	}

}
