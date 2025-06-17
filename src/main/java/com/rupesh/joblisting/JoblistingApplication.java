package com.rupesh.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.rupesh.joblisting.repository")
public class JoblistingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

}
