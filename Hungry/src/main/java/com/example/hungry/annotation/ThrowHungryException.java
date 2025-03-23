package com.example.hungry.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//  自定义注解，用于标记需要触发异常的方法上

@Target(ElementType.METHOD)             //  注解作用在方法上
@Retention(RetentionPolicy.RUNTIME)     //  运行时生效
public @interface ThrowHungryException {
    int code() default 500;             //  默认状态码
    String message() default "KFC Crazy Thursday need 50RMB.";
}
