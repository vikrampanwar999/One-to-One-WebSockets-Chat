package com.amr.chatservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


import lombok.extern.slf4j.Slf4j;

//@SpringBootApplication(exclude = EmbeddedMongoAutoConfiguration.class)
@SpringBootApplication
@EnableMongoAuditing
@Slf4j
@EnableMongoRepositories
public class ChatServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatServiceApplication.class, args);
	}

}
