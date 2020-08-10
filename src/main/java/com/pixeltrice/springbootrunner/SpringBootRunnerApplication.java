package com.pixeltrice.springbootrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnerApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunnerApplication.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("This will run just after application started");
		
	}

}
