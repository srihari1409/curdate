package com.srihello.springboot.srihelloworld;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
@RequestMapping("/hello-world")		
public String HelloWorld() {
	return"Hello World";
}

@RequestMapping("/sri")		
public String sap() {
	return"Hello World 1";
}

@RequestMapping("/Cur_Date")
public String Cd() {
	LocalDate date = LocalDate.now();
	return "Current Date: "+date;
}
}
