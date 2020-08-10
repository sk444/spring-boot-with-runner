package com.pixeltrice.springbootrunner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunnerController {
	
	@GetMapping("/home")
	void get(){
		System.out.println("Welcome to Runner Controller");
	}

}
