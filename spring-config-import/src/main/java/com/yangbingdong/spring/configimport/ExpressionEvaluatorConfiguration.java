package com.yangbingdong.spring.configimport;

import com.yangbingdong.component.ExpressionEvaluator;
import com.yangbingdong.component.InfixExpressionEvaluator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Configuration(proxyBeanMethods = false)
public class ExpressionEvaluatorConfiguration {

    @Bean
    public ExpressionEvaluator expressionEvaluator() {
        return new InfixExpressionEvaluator();
    }

}
