package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    //    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeGetLoggingAdvice(){
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//        System.out.println("beforeGetLoggingAdvice: logging attempt to get book/magazine");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments){
                if(obj instanceof Book){
                    Book myBook = (Book)obj;
                    System.out.println("Information about the book : name - "+myBook.getName()+
                            ", author - "+myBook.getAuthor()+", year of publication - "+myBook.getYearOfPublication());
                }else if(obj instanceof String){
                    System.out.println("Book is being added into the library by "+obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: logging attempt to get book/magazine");
        System.out.println("---------------------------------------");
    }
}
