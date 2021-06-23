package io.varun.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
public class AuthServerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AuthServerApplication.class, args);

		SpringApplication application = new SpringApplication(AuthServerApplication.class);
		InitializeFirebase initializeFirebase = new InitializeFirebase();
		initializeFirebase.init();
		application.run(args);
	}

}
