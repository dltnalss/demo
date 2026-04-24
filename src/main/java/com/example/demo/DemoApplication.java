package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
	public void sayHello() {
		System.out.println("Hello from Demo1Application!");
	}

	public int addNumbers(int a, int b) {
		return a + b;
	}

	public String getStatus() {
		return "Application is running";
	}

	public String getA() {
		return "F";
	}
}
