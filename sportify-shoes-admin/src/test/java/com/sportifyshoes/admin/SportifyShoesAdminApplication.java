package com.sportifyshoes.admin;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.sportifyshoes.admin.controller.ProductController;

@SpringBootApplication
@ComponentScan("com.sportifyshoes.admin")
public class SportifyShoesAdminApplication {

	public static void main(String[] args) {
		new File (ProductController.uploadDirectory).mkdir();
		SpringApplication.run(SportifyShoesAdminApplication.class, args);
	}

}
