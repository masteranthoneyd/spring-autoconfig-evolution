package com.yangbingdong.spring.configimport;

import com.yangbingdong.component.ExpressionEvaluator;
import com.yangbingdong.spring.third.ExpressionEvaluatorConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bingdong.yang@salesforce-china.com
 */
class JavaConfigImportTest {

    @Test
    void test() {
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);) {
            ExpressionEvaluator evaluator = ctx.getBean(ExpressionEvaluator.class);
            int rs = evaluator.evaluate("5+7*3*(2+1)");
            assertEquals(68, rs);
            System.out.println(rs);

            ExpressionEvaluatorConfiguration bean = ctx.getBean(ExpressionEvaluatorConfiguration.class);
            System.out.println(bean);
        }
    }
}
