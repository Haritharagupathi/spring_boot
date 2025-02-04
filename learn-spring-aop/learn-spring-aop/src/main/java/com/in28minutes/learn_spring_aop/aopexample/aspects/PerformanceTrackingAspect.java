package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinpoint) throws Throwable {
        long startTimeMillis = System.currentTimeMillis();
        
        // Proceed with method execution
        Object returnValue = proceedingJoinpoint.proceed();
        
        long stopTimeMillis = System.currentTimeMillis();
        long executionDuration = stopTimeMillis - startTimeMillis;  // Corrected calculation

        logger.info("Around aspect - {} method executed in {} ms", proceedingJoinpoint.getSignature(), executionDuration);

        return returnValue;
    }
}
