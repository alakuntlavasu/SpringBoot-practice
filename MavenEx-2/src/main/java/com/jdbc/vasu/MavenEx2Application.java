package com.jdbc.vasu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class MavenEx2Application {

	public static void main(String[] args) {
		SpringApplication.run(MavenEx2Application.class, args);
		System.out.println("Spring started,.,,");
	}

}
