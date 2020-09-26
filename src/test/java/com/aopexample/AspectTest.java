package com.aopexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AspectTest {

	@Test
	void test() {
		ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
				
				ArithmeticCalculator arithmeticCalculator =
				context.getBean("arithmeticCalculator", ArithmeticCalculator.class);
				arithmeticCalculator.add(1, 2);
				arithmeticCalculator.sub(4, 3);
				arithmeticCalculator.mul(2, 3);
				arithmeticCalculator.div(4, 2);
				UnitCalculator unitCalculator = context.getBean("unitCalculator", UnitCalculator.class);
				unitCalculator.kilogramToPound(10);
				unitCalculator.kilometerToMile(5);
	}

}
