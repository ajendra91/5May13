package com.example.Logger;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

	//public static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		log.info("ajendra is here");

		//logger.info("ajendra info");
		//logger.warn("ajendra warn");
		//logger.debug("ajendra debug");
		//logger.error("ajendra error");
	}

}
