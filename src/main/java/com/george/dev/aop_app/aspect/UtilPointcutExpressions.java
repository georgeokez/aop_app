package com.george.dev.aop_app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UtilPointcutExpressions {

    // Basic pointcut expression targeting any method call to addAccount across the entire app
    @Pointcut("execution(public void addAccount())")
    public void pointcutAddAccount(){}

    // Pointcut expression takes any return type
    // And any class in package com.george.dev.aop_app.dao.*
    // And any method with any number of paramters
    @Pointcut("execution(* com.george.dev.aop_app.dao.*.*(..))")
    public void pointcutAllMethods(){}

    // Pointcut expression takes any return type
    // And any class in package com.george.dev.aop_app.dao.*
    // With any method beginning with add and takes no parameter
    @Pointcut("execution(* com.george.dev.aop_app.dao.*.add*())")
    public void allMethosWithAddAccount(){}

    // pointcut expression for all getter methods in all classes in package
    // taking any number of arguments
    @Pointcut("execution(* com.george.dev.aop_app.dao.*.get*(..))")
    public void getterPointcut(){}

    // pointcut expression for all setter methods in all classes in package
    // taking any number of arguments
    @Pointcut("execution(* com.george.dev.aop_app.dao.*.set*())")
    public void setterPointcut(){}

    // Pointcut expression uses conditional statements to select the actual pointcut
    // expression to use and those to reject
    //@Pointcut("pointcutAddAccount() && !(getterPointcut() || setterPointcut())")
    @Pointcut("pointcutAddAccount()")
    public void excludeSetterAndGetterPC(){}

}
