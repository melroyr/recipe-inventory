package com.myco.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.myco.recipe.model"}) 
public class ReicepeInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReicepeInventoryApplication.class, args);
	}

}
