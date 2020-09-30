package com.springProxy;

public class FactoryService {
	
	public Object getBean(String beanType) {
		if(beanType.equals("Bicycle")) return "Here is your bicycle!";
		if(beanType.equals("Car")) return "Here is your car!";
		if(beanType.equals("Truck")) return "Here is your truck!";
		return null;
	}

}
