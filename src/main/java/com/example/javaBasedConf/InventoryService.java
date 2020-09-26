package com.example.javaBasedConf;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InventoryService {
	
	private String message;
	
	public String getMyMessage() {
		return "Hey, this is the message!";
	}

}
