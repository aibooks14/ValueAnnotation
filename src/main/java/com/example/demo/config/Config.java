package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Autowired private RestTemplateConfig restTemplateConfig ;
	
	
	//ork.beans.factory.BeanCreationException
//	public String proxyPort = restTemplateConfig.getProxyUser() ; //Error


		
		public void testMethod() {
			System.out.println(restTemplateConfig.getProxyPort());
			System.out.println(restTemplateConfig.getProxyHost());
			System.out.println(restTemplateConfig.getProxyUser());
			System.out.println(restTemplateConfig.getProxyPassword());
			
			System.out.println(restTemplateConfig.getConnectTimeout());
			System.out.println(restTemplateConfig.getReadTimeout());
		}

}
