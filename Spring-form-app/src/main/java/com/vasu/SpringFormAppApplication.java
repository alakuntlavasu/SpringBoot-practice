package com.vasu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringFormAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFormAppApplication.class, args);
		System.out.println("spring boot Application stated");
	}

}
