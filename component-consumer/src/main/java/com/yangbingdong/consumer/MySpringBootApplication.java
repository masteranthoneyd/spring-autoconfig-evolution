package com.yangbingdong.consumer;

import com.yangbingdong.spring.autoconfig.MyEnableConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@MyEnableConfiguration
@ComponentScan
public @interface MySpringBootApplication {
}
