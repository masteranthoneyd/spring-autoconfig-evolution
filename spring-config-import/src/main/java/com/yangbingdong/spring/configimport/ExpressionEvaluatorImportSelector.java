package com.yangbingdong.spring.configimport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class ExpressionEvaluatorImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.yangbingdong.spring.configimport.ExpressionEvaluatorConfiguration"};
    }
}
