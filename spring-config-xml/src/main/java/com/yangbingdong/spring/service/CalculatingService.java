package com.yangbingdong.spring.service;

import com.yangbingdong.component.TaxCalculator;

import java.math.BigDecimal;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class CalculatingService {

    private TaxCalculator taxCalculator;


    public BigDecimal calculate(BigDecimal input) {
        return taxCalculator.calc(input);
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
}
