package com.yangbingdong.spring.autoconfig;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Properties;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Properties properties = MyConfigLoader.loadConfig("/META-INF/load-config.properties");
        String strings = (String) properties.get(MyEnableConfiguration.class.getName());
        return new String[]{strings};
    }
}
