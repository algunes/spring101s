package com.example.javaBasedConf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;


@Configuration
@PropertySource("classpath:messages.properties")
@ComponentScan
public class ServiceConfiguration {
	
	@Value("${warning:}")
	private String message;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer
		propertySourcesPlaceholderConfigurer() {
		// Once you define the @PropertySource annotation to load the properties file, you also need to define a PropertySourcePlaceholderConfigurer bean
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name="inventoryService")
	public InventoryService inventoryService() {
		InventoryService is = new InventoryService();
		is.setMessage(message);
		return is;
	}

	@Bean(name={"productService", "productService2"})
	public ProductService productService() {
		return new ProductService();
	}
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource rbms() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages");
		return messageSource;
	}
}
