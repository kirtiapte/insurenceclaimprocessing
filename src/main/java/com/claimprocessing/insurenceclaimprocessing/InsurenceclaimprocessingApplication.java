package com.claimprocessing.insurenceclaimprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@SpringBootApplication
@ComponentScan(basePackages = "com.claimprocessing") 
public class InsurenceclaimprocessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurenceclaimprocessingApplication.class, args);
	}

}
