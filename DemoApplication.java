package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@EnableConfigurationProperties(HelloProperties.class)
public class DemoApplication {

	   
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*
	@Bean
	public TodoRepository todoRepository() {
	    return new InMemoryTodoRepository();
	}
	*/
	
	
	@Bean
	//public ObjectMapper jsonObjectMapper() {
	public Jackson2ObjectMapperBuilder jsonObjectMapper() {
	     //return Jackson2ObjectMapperBuilder.json();
	     return Jackson2ObjectMapperBuilder.json();
	}
	
}
