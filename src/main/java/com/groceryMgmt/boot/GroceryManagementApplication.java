package com.groceryMgmt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.groceryMgmt.boot")
@EnableJpaRepositories("com.groceryMgmt.boot")
public class GroceryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryManagementApplication.class, args);
	}

}
