package ru.ave.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotNullArgsAspect {

    @Around("@annotation(notNullArgs)")
    public Object nullParameterCheck(ProceedingJoinPoint pjp, NotNullArgs notNullArgs) throws Throwable {
        for (int i = 0; i < pjp.getArgs().length; i++) {
            if (pjp.getArgs()[i] == null) throw new IllegalArgumentException("Build report. Method "
                    + pjp.getSignature().getName() + " called. Arg[" + i + "] is null");
        }
        return pjp.proceed();

    }



}
