package com.yangbingdong.spring.xmlconfig;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bingdong.yang@salesforce-china.com
 */
class XmlScanTest {

    @Test
    void scannableXmlConfigTest() {
        try (ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("scan.xml")) {
            TaxCalculatorScannableXmlComponent taxCalculator = ctx.getBean(TaxCalculatorScannableXmlComponent.class);
            BigDecimal rs = taxCalculator.calc(new BigDecimal("100"));
            assertEquals(10, rs.intValue());
            System.out.println(rs);
        }
    }
}
