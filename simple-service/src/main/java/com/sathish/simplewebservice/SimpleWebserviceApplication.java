package com.sathish.simplewebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SimpleWebserviceApplication {

	@RequestMapping("/greetings")
	public Greetings sayHello() {
		Greetings greeting = new Greetings();
		greeting.setMessage("Hello World!");
		return greeting;
	}
    public static void main(String[] args) {
        SpringApplication.run(SimpleWebserviceApplication.class, args);
    }
    
    static class Greetings {
    	
    	public Greetings() {
			super();
		}

		private String  message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
    }
   
}
