package com.vdnsmd.spring.actuator.work.springactuatorexample.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
		@GetMapping("/sayHi")
		public String sayHiToWorld() {
			return "Hello, I am your rest endpoint!!";
			
		}

}
