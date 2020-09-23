package com.reytech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	private static final long serialVersionUID = 1905162041950251407L;
	
	private Set<Integer> mySet;      // Findbugs error
	
	private HashSet<Integer> myOtherSet;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
