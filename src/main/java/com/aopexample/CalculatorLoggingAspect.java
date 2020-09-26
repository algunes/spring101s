package com.aopexample;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@Before("execution(* ArithmeticCalculator.add(..))")
	public void logBefore() {
		log.info("This is logBefore! The method add() begins.");
	}
	
	@Before("execution(* *.*(..))")
	public void logBeforeAll(JoinPoint joinPoint) {
		log.info("This is logBeforeAll! The method " + joinPoint.getSignature().getName()
				+ "() begins with " + Arrays.toString(joinPoint.getArgs()));
	}

}