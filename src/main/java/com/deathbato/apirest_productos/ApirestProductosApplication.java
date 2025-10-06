package com.deathbato.apirest_productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class ApirestProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestProductosApplication.class, args);
	}

    @GetMapping
    public String hello(){
        return "Hola desde Spring Boot";
    }
}
