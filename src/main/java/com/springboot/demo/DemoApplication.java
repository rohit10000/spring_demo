package com.springboot.demo;

//import com.springboot.demo.models.Gender;
// import com.springboot.demo.models.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Welcome to spring class!!");
	}

}
