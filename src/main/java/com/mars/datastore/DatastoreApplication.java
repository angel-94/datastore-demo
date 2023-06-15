package com.mars.datastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.context.annotation.Bean;

import java.time.Clock;

@SpringBootApplication
@EnableDatastoreRepositories(basePackages = "com.mars.datastore.repository")
public class DatastoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatastoreApplication.class, args);
	}

	@Bean
	public Clock clock() {
		return Clock.systemDefaultZone();
	}

}
