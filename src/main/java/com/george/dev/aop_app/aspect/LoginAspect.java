package com.george.dev.aop_app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    /*@Pointcut("execution(public void addAccount())")
    private void pointcutAddAccount(){}

    // applying a pointcut declarartion
    @Before("pointcutAddAccount()")
    public void beforeAddAccountAdvice(){
        logger.info("Executing @Before advice on addAccount()");
    }

    // Pointcut expression to match a specific method within a specific class
    @Before("execution(public void com.george.dev.aop_app.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice1(){
        logger.info("Executing @Before advice on addAccount()");
    }

    //Pointcut expression with return type wildcard (*) and any method having add suffixed to it
    @Before("execution(* add*())")
    public void beforeAddAccountAdvice2(){
        logger.info("Executing @Before advice on addAccount()");
    }*/

}
