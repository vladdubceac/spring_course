package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class SecurityAspect {

//    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeGetSecurityAdvice(){
    public void beforeAddSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: checking rights for getting book/magazine");
        System.out.println("beforeAddSecurityAdvice: checking rights for getting book/magazine");
        System.out.println("---------------------------------------");
    }
}
