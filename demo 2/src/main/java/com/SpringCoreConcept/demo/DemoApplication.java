package com.SpringCoreConcept.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	private final SimpleService simple;

	@Override
	public void run(String... args) throws Exception {
		simple.saveUser("Hello World");

	}

	public DemoApplication(SimpleService simple) {
		this.simple = simple;
	}
}
