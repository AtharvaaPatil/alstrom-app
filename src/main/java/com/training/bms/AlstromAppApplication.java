package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlstromAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlstromAppApplication.class, args);
		System.out.println("Alstrom app created");
		System.out.println("Alstrom app updated");
		System.out.println("Checking Build");
	}

}
