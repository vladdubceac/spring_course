package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAdvice: trying to return the book ");

//        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: was caught exception " + e);
//            targetMethodResult="Unknown book";
            throw e;
        }
//        long end = System.currentTimeMillis();

        System.out.println("aroundReturningBookLoggingAdvice: successfully returned the book ");
//        System.out.println("aroundReturningBookLoggingAdvice: method returnBook executed in "+(end-begin)+" milliseconds");
        return targetMethodResult;
    }
}
