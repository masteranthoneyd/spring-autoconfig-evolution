package com.yangbingdong.spring.configimport;

import com.yangbingdong.component.ExpressionEvaluator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bingdong.yang@salesforce-china.com
 */
class XmlImportTest {

    @Test
    void evaluatorTest() {
        try (ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml")) {
            ExpressionEvaluator evaluator = ctx.getBean(ExpressionEvaluator.class);
            int rs = evaluator.evaluate("5+7*3*(2+1)");
            assertEquals(68, rs);
            System.out.println(rs);
        }
    }
}
