package com.sathish.webserviceconsumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.webserviceconsumer.integration.SimpleServiceIntegration;

@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
@RestController
public class SimpleWebserviceClientApplication {
	
	@Autowired
	private SimpleServiceIntegration simpleServiceIntegration; 

	@RequestMapping("/findgreetingsservice")
	public List<ServiceInstance> findServiceUrl() {
		return simpleServiceIntegration.serviceUrl();
	}

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebserviceClientApplication.class, args);
            
    }
}
