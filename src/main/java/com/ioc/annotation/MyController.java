package com.ioc.annotation;

import java.lang.annotation.*;

/**
 * @Author sxx
 * 类 名: MyController
 * 描 述: 注入注解--将需要交给IOC容器管理的类放置 -- 定义在属性上的
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyController {
}
