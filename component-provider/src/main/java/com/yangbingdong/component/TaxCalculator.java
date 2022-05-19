package com.yangbingdong.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.math.BigDecimal;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class TaxCalculator implements InitializingBean, DisposableBean {

    private final BigDecimal taxRate;

    public TaxCalculator(String taxRate) {
        this.taxRate = new BigDecimal(taxRate);
    }

    public BigDecimal calc(BigDecimal input) {
        return input.multiply(taxRate);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("TaxCalculator postConstruct");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("TaxCalculator afterPropertiesSet");
    }

    public void customInit() {
        System.out.println("TaxCalculator customInit");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("TaxCalculator preDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("TaxCalculator destroy");
    }

    public void customDestroy() {
        System.out.println("TaxCalculator customDestroy");
    }
}