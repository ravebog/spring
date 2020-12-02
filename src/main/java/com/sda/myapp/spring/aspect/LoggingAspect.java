package com.sda.myapp.spring.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before(value = "execution(* com.sda.myapp.spring.types.*.*(..))")
    void aspectExecutedBeforeExecutingTargetedMethods() {
        System.out.println("before executing method call BEFORE");
    }


}
