package com.srihello.springboot.srihelloworld;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
//(exclude = {ErrorMvcAutoConfiguration.class})
public class SriHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SriHelloWorldApplication.class, args);
		Currentdate();
	}
	
	 public static void Currentdate() {
		// TODO Auto-generated method stub
		 LocalDate date = LocalDate.now();
	     System.out.println("Current Date: "+date);
		
	}

	
}

