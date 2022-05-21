package com.yangbingdong.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class MySpringApplicationRunner {

    public static ApplicationContext run(Class<?> mainClass) {
        return new AnnotationConfigApplicationContext(mainClass);
    }
}
