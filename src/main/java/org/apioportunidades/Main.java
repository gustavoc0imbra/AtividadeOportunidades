package org.apioportunidades;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Opportunity", description = "Opportunity's API description", version = "0.1"))
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}