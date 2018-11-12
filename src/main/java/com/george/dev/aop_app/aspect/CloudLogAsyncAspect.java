package com.george.dev.aop_app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.george.dev.aop_app.aspect.UtilPointcutExpressions;

@Aspect
@Component
@Order(2)
public class CloudLogAsyncAspect {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Before("UtilPointcutExpressions.excludeSetterAndGetterPC()")
    public void performCloudLoggin(){
        logger.info("@Before Advice ===> Saving to the Cloud");
    }
}
