package io.varun.apigatewayserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.varun.apigatewayserver.filter.error.ErrorFilter;
import io.varun.apigatewayserver.filter.post.PostFilter;
import io.varun.apigatewayserver.filter.pre.PreFilter;
import io.varun.apigatewayserver.filter.route.RouteFilter;

@Configuration
//@ConfigurationProperties(prefix = "api-gateway-service")
public class ApiGatewayConfig {

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
}
