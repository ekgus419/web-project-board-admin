package com.web.board.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class WebProjectBoardAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebProjectBoardAdminApplication.class, args);
	}

}
