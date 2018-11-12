package com.george.dev.aop_app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class ApiAnalyticAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Before("UtilPointcutExpressions.pointcutAddAccount()")
    public void performApiAnalytics(){
        logger.info("@Before Advice ===> Performing API Analytics");
    }

}
