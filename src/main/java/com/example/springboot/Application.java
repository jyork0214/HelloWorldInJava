// https://spring.io/guides/gs/spring-boot/
// follow directions and download ZIP 
//      https://github.com/spring-guides/gs-spring-boot/archive/main.zip
// open terminal
// cd /Users/jamesyork/Desktop/SpringBoot/Projects/HelloWorld
// extract contents of ZIP to folder
// mvn spring-boot:run
// http://localhost:8080/hello

package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) 
	{
		return args -> 
		{
			System.out.println("------> **** APPLICATION START!!!\r\n\r\n\r\n");
			/*
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) 
			{
				String msg = String.format("Bean Name:  %s", beanName);
				System.out.println(msg);
			}
			*/
			System.out.println("------> **** APPLICATION STOP!!!\r\n\r\n\r\n");
		};
	}
}
