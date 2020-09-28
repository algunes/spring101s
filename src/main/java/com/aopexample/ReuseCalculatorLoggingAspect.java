package com.aopexample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReuseCalculatorLoggingAspect {

	@Pointcut("execution(* *.*(..))")
	private void loggingOperation() {
		
	}
	
	@Before("loggingOperation()")
	public void logBefore(JoinPoint joinPoint) {
	
	}
	
	@AfterReturning(pointcut = "loggingOperation()", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
	
	}
	
	@AfterThrowing(pointcut = "loggingOperation()",	throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException e) {
	
	}
	
	@Around("loggingOperation()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		return null;
	}

}
