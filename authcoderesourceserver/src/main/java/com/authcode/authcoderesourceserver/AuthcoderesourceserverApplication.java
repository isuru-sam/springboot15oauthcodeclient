package com.authcode.authcoderesourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AuthcoderesourceserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthcoderesourceserverApplication.class, args);
	}
}
