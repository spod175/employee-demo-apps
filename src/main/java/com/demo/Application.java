package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication 
@EnableSwagger2
public class Application {

	// http://localhost:9090/v2/api-docs -> json -> interface
	// http://localhost:9090/swagger-ui.html -> html

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
