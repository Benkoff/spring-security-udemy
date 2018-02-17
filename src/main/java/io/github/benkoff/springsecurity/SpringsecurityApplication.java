package io.github.benkoff.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringsecurityApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringsecurityApplication.class, args);
	}
}
