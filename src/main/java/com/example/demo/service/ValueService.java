package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.RestTemplateConfig;

@Service
public class ValueService {
	
	@Autowired private RestTemplateConfig restTemplateConfig ;

//public ValueService(RestTemplateConfig restTemplateConfig) {
//	super();
//	this.restTemplateConfig = restTemplateConfig;
//}
	
	
	public void testMethod() {
		System.out.println(restTemplateConfig.getProxyPort());
	}
	

}
