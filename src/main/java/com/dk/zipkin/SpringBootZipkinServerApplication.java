package com.dk.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class SpringBootZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZipkinServerApplication.class, args);
	}

}
