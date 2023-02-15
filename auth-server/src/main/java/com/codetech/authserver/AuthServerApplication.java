package com.codetech.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AuthServerApplication extends SpringBootServletInitializer {
	@Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(AuthServerApplication.class);
        }
	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}

/*	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
*/
}
