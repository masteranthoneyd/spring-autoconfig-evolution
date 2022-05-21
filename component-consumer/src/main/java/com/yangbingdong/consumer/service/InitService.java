package com.yangbingdong.consumer.service;

import com.yangbingdong.component.ExpressionEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Service
public class InitService {

    @Autowired
    private ExpressionEvaluator expressionEvaluator;

    @PostConstruct
    public void afterPropertiesSet() {
        int rs = expressionEvaluator.evaluate("5+7*3*(2+1)");
        System.out.println(rs);
    }
}
