package com.yangbingdong.spring.configimport;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author bingdong.yang@salesforce-china.com
 */
@Configuration
@ComponentScan
@Import(ExpressionEvaluatorConfiguration.class)
//@Import(ExpressionEvaluatorImportSelector.class)
public class ApplicationConfiguration {
}
