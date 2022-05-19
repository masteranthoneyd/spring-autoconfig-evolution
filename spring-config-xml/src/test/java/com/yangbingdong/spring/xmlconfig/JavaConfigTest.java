package com.yangbingdong.spring.xmlconfig;

import com.yangbingdong.component.ExpressionEvaluator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bingdong.yang@salesforce-china.com
 */
class JavaConfigTest {

    @Test
    void test(){
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);) {
            ExpressionEvaluator evaluator = ctx.getBean(ExpressionEvaluator.class);
            int rs = evaluator.evaluate("5+7*3*(2+1)");
            assertEquals(68, rs);
            System.out.println(rs);

            TaxCalculatorScannableXmlComponent taxCalculator = ctx.getBean(TaxCalculatorScannableXmlComponent.class);
            BigDecimal bigDecimal = taxCalculator.calc(new BigDecimal("100"));
            assertEquals(10, bigDecimal.intValue());
            System.out.println(bigDecimal);
        }
    }
}
