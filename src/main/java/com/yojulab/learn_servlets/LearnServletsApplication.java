package com.yojulab.learn_servlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class LearnServletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnServletsApplication.class, args);
	}

}
