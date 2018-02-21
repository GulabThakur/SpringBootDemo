package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.authanticate.WebSecurity;

@SpringBootApplication
public class Application {

	@Bean
	public BCryptPasswordEncoder passwordCript() {
		return new BCryptPasswordEncoder();
	}
	
   @Bean
   public WebSecurity webSecurity(UserDetailsService userDetailsService, BCryptPasswordEncoder passwordCript) {
	   return new WebSecurity(userDetailsService, passwordCript);
   }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
