package com.ioc.annotation;

import java.lang.annotation.*;
/**
 * @Author sxx
 * 类 名: MyValue
 * 描 述: 获取文件中的键值对
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface MyValue {
    String value() default "";
}
