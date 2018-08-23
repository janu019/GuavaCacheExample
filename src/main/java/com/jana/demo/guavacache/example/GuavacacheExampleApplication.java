package com.jana.demo.guavacache.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jana.demo.guavacache.example")
public class GuavacacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuavacacheExampleApplication.class, args);
	}
}