package com.github.cristianbermejo.course.bookscrud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {
		"com.github.cristianbermejo.course.bookscrud.client.controller",
		"com.github.cristianbermejo.course.bookscrud.client.service"
})
public class BooksCrudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksCrudClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		RestTemplate template = new RestTemplate();
		BasicAuthenticationInterceptor authenticationInterceptor = new BasicAuthenticationInterceptor("admin", "admin");
		
		template.getInterceptors().add(authenticationInterceptor);
		
		return template;
	}

}
