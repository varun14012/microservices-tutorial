package io.varun.loggingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class LoggingServiceApplication {
	private static final Logger LOG = LoggerFactory.getLogger(LoggingServiceApplication.class);

	public static void main(String[] args) {
		LOG.info("In Main method LoggingServiceApplication.");
		SpringApplication.run(LoggingServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		LOG.info("In rest template LoggingServiceApplication.");
		return new RestTemplate();
	}

	@RequestMapping("/logging")
	public String logging() {
		LOG.info("In logging service LoggingServiceApplication.");
		return "In logging service.";

	}

}
