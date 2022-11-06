package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionHandlingAspect {
//    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeGetExceptionHandlingAdvice(){
    public void beforeAddExceptionHandlingAdvice(){
//        System.out.println("beforeGetExceptionHandlingAdvice: catching/handling exception during attempt to get book/magazine");
        System.out.println("beforeAddExceptionHandlingAdvice: catching/handling exception during attempt to get book/magazine");
        System.out.println("---------------------------------------");
    }
}
