package com.ToDoList.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.ToDoList.beans")
@EnableJpaRepositories(basePackages = {"com.ToDoList.repository"})
@ComponentScan(basePackages = {
						"com.ToDoList.service",
						"com.ToDoList.controller"
						})
public class ToDoListApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

}
