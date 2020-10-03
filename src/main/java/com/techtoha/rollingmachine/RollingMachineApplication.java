package com.techtoha.rollingmachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class RollingMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollingMachineApplication.class, args);
	}

}
