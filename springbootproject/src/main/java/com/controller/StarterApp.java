package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class StarterApp {
	
	public static void main(String args[]) {
		
		SpringApplication springapplication = new SpringApplication(StarterApp.class);
		springapplication.run();
	}

}
