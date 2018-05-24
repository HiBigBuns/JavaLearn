package com.bigbaozi.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Name: CountTime
 * Author: zhangfenglin
 * Email: zhfenglin@163.com
 * Comment: //注解
 * Date: 2018-05-24 13:59
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface CountTime {
    String [] value();
    int code() default 0;
}
