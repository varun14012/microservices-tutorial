package io.varun.turbinestreamservice;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineStreamServiceApplication {
	private static final Logger LOG = LoggerFactory.getLogger(TurbineStreamServiceApplication.class);
	static {
		// for localhost testing only
		LOG.warn("Will now disable hostname check in SSL, only to be used during development");
		HttpsURLConnection.setDefaultHostnameVerifier((hostname, sslSession) -> true);
	}

	public static void main(String[] args) {
//		SpringApplication.run(TurbineStreamServiceApplication.class, args);
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(TurbineStreamServiceApplication.class)
				.run(args);
		LOG.info("Connected to RabbitMQ at: {}", ctx.getEnvironment().getProperty("spring.rabbitmq.host"));
	}

}
