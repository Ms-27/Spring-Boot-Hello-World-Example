package com.reytech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	private Set<Integer> mySet;      // Findbugs error
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
