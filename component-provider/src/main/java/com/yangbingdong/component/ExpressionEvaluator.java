package com.yangbingdong.component;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public interface ExpressionEvaluator extends InitializingBean {
    int evaluate(String expression);

    @Override
    default void afterPropertiesSet() {
        System.out.println(this.getClass().getSimpleName() + " afterPropertiesSet...");
    }
}
