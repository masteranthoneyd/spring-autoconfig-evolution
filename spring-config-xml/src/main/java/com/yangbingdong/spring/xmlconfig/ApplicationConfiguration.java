package com.yangbingdong.spring.xmlconfig;

import com.yangbingdong.component.ExpressionEvaluator;
import com.yangbingdong.component.InfixExpressionEvaluator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public ExpressionEvaluator expressionEvaluator() {
        return new InfixExpressionEvaluator();
    }

}
