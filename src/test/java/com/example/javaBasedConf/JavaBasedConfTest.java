package com.example.javaBasedConf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JavaBasedConfTest {
	
	private ApplicationContext context;
	private ProductService ps;
	private InventoryService is;
	
	@BeforeAll
	@DisplayName("Instantiate the Spring IoC Container to Scan for Annotations")
	void initSpring() {
		
		context = new AnnotationConfigApplicationContext(ServiceConfiguration.class);
		ps = (ProductService) context.getBean("productService2");
		is = (InventoryService) context.getBean("inventoryService");
		
	}

	@Test
	@DisplayName("Getting the ProductService object from Spring")
	void test() {
		
		assertEquals("Hey, this is the message!", ps.getIs().getMyMessage());
	}
	
	@Test
	@DisplayName("Using Message Source To Get Text From Property Files")
	void messageSourceTest() {
		assertEquals("I'am warning you!", context.getMessage("warning", null, "Default Warning!", null));
	}
	
	@Test
	@DisplayName("Properties File Data to Set Up POJO Instantiation Values")
	void propertiesFileData() {
		assertEquals("I'am warning you!", is.getMessage());
	}

}
