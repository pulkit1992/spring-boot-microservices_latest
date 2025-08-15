package com.java.OrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	/*@Bean
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateInterceptor restTemplateInterceptor) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(List.of(restTemplateInterceptor));
		return restTemplate;
	}*/

}
