package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
//    @Pointcut("execution(* get*())")
//    public void allGetMethods(){}

    @Pointcut("execution(* add1*(..))")
    public void allAddMethods(){}
}
