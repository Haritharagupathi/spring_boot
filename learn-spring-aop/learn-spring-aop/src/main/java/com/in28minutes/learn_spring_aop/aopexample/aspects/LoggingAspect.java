package com.in28minutes.learn_spring_aop.aopexample.aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
 private Logger logger = LoggerFactory.getLogger(getClass());
 
 @Before("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
	public void logMethodCallBeforeExcecution(JoinPoint joinPoint) {
		logger.info("Before aspect-Method is called-{}",joinPoint);
		
		
	}
	@After("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()")
	public void logMethodCallAfterExecution(JoinPoint joinPoint) {
		logger.info("After aspect-{}has executed",joinPoint);
		
		
	}
	@AfterThrowing(pointcut="com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()",
			throwing="exception")
	public void logMethodCallAfterException(JoinPoint joinPoint,Exception exception) {
		logger.info("AfterThrowing  aspect-{}has thrown an exception ",joinPoint,exception);	
		
	}
	
	@AfterReturning(pointcut="com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()",
			returning="resultValue")
	public void logMethodCallAfterSuccessfulExcecution(JoinPoint joinPoint,Object resultValue) {
		logger.info("AfterReturning  aspect-{}has returned {}  ",joinPoint,resultValue);	
		
	}
	
	

}
