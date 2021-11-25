package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		System.out.println("add: "+add(2,5));
	}

	public static int add(int a,int b) {
		return a+b;
	}
	
}
