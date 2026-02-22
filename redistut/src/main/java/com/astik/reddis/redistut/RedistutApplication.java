package com.astik.reddis.redistut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedistutApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedistutApplication.class, args);
	}

}
