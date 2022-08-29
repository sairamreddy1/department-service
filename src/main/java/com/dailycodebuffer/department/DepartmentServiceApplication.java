package com.dailycodebuffer.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
		System.out.println("main method executed");
		System.out.println("sec method executed");
		System.out.println("th method executed");
		System.out.println("fr method executed");

	}

}
