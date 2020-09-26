package com.example.javaBasedConf;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductService {
	
	@Autowired
	private InventoryService is;
	
}
