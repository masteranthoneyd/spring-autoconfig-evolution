package com.yangbingdong.spring.third;

import com.yangbingdong.component.ExpressionEvaluator;
import com.yangbingdong.component.RpnConverter;
import com.yangbingdong.component.RpnExpressionEvaluator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Configuration(proxyBeanMethods = false)
public class ExpressionEvaluatorAutoConfiguration {

    @Bean
    public ExpressionEvaluator expressionEvaluator() {
//        return new InfixExpressionEvaluator();
        return new RpnExpressionEvaluator(new RpnConverter());
    }

}
