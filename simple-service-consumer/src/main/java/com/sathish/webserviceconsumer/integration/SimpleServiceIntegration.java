package com.sathish.webserviceconsumer.integration;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleServiceIntegration {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	public List<ServiceInstance> serviceUrl() {
		List<ServiceInstance> instances = discoveryClient.getInstances("simple-service");
		for(ServiceInstance instance: instances) {
			System.out.println("Instance:" + instance.getUri());
		}
		return instances;
	}
	
}
