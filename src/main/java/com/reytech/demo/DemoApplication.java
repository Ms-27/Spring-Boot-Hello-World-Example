package com.reytech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private String nom = "12";
	
	public static void findbugDoesNotTrigger(List<String> object) {
	    String string1 = object.get(0);
	    String string2 = "AnyString";
	    if(string1 == string2) {
		System.out.println("Does not matter at all");   
	    }
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
