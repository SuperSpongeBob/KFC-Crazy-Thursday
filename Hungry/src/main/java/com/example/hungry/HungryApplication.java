package com.example.hungry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class HungryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HungryApplication.class, args);
	}

}
