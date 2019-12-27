package io.varun.apigatewayserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
//@EnableZuulServer
public class ApiGatewayServerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(ApiGatewayServerApplication.class);

	public static void main(String[] args) {
		LOG.info("In Main method API Gateway.");
		SpringApplication.run(ApiGatewayServerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		LOG.info("In rest template API Gateway.");
		return new RestTemplate();
	}

	@Bean
	public Sampler alwaysSampler() {
		LOG.info("In always Sampler API Gateway.");
		return Sampler.ALWAYS_SAMPLE;
	}

}
