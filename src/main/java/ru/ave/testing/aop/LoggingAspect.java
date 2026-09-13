package ru.ave.testing.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* ru.ave.testing.TaskManager.*(..))")
    public void loggingBefore(JoinPoint joinPoint) {
        System.out.println("Вызван метод: " + joinPoint.getSignature().getName());
    }

//    @Around("execution(* ru.ave.testing.TaskManager.*(..))")
    @Around("@annotation(SomeAnnotation)")
    public Object loggingTest(ProceedingJoinPoint pjp) throws Throwable {
        try {
            return pjp.proceed();
        } finally {
            System.out.println("Around метод вызван");
        }
    }

//    @Before("@annotation(someAnnotation)")
//    public void someMethod(JoinPoint joinPoint) {
//        System.out.println("Метод вызван по аннотации. Метод: " + joinPoint.getSignature().getName());
//    }

}
