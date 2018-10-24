package io.pivotal.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyServerConfigApplication.class, args);
	}
}
