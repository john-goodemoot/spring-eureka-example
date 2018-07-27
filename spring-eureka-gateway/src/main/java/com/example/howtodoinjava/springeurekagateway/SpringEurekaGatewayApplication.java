package com.example.howtodoinjava.springeurekagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringEurekaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaGatewayApplication.class, args);
	}
}
