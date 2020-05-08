package com.nc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class NeighborhoodClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeighborhoodClubApplication.class, args);
	}
}
