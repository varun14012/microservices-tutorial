package io.varun.hystrixdashboardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixDashboardServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardServerApplication.class, args);
	}

}
