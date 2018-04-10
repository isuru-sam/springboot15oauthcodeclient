package com.authcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@ComponentScan({"com.authcode.client","com.authcode"})
@Configuration
@EnableOAuth2Client
public class AuthcodeclientappApplication extends  SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AuthcodeclientappApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AuthcodeclientappApplication.class);
    }
}
