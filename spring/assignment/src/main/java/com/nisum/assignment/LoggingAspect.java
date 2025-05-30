package com.nisum.assignment;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.nisum.assignment.*.*(..))")
    public void logBeforeExecution() {
        System.out.println("Method execution started at: " + System.currentTimeMillis());
    }
}