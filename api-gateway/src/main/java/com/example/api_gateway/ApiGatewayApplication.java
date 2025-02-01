package com.example.api_gateway;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("API_GATEWAY_APPLICATION_NAME", dotenv.get("API_GATEWAY_APPLICATION_NAME"));
		System.setProperty("GATEWAY_SERVER_PORT", dotenv.get("GATEWAY_SERVER_PORT"));
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
