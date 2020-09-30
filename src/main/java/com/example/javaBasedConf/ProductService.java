package com.example.javaBasedConf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductService {
	
	@Autowired
	@Qualifier("inventoryService")
	private InventoryService is;
	
}
