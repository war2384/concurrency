package com.imooc.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by war on 2019/3/1.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
/**
 * 用来标记【线程安全】的类和写法
 */
public @interface ThreadSafe {

    String value() default "";

}
