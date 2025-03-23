package com.example.hungry.aspect;

import com.example.hungry.annotation.ThrowHungryException;
import com.example.hungry.exception.HungryException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * AOP切面编程
 * 仅作用于带有 @HungryException 注解的方法上
 */

@Aspect
@Component
public class HungryExceptionAspect {
    @Around("@annotation(throwHungryException)")     //  拦截带有 @HungryException 注解的方法
    public Object hungryException(ProceedingJoinPoint joinPoint, ThrowHungryException throwHungryException) throws Throwable {
        //  获取当前日期
        LocalDate today = LocalDate.now();

        //  判断今天是否是星期四
        if (today.getDayOfWeek() == DayOfWeek.THURSDAY) {
            try {
                //  从注解中获取状态码和异常信息
                int code = throwHungryException.code();
                String message = throwHungryException.message();
                throw new HungryException(code, message);
            }catch (HungryException e) {
                //  在控制台打印异常信息
//                e.printStackTrace();    //  控制台打印一大片异常信息
                System.err.println("KFC HungryException on Thursday:" + e.getMessage());  //  控制台简单打印信息
            }
        }

        //  如果不是星期四则继续执行原方法
        return joinPoint.proceed();
    }
}
