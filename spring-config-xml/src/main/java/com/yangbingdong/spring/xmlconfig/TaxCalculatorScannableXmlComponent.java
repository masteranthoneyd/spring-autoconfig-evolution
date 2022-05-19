package com.yangbingdong.spring.xmlconfig;

import com.yangbingdong.component.TaxCalculator;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Component
public class TaxCalculatorScannableXmlComponent {
    private final TaxCalculator taxCalculator = new TaxCalculator("0.1");

    public BigDecimal calc(BigDecimal input) {
        return taxCalculator.calc(input);
    }
}