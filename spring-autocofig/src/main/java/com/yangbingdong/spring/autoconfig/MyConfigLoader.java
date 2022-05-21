package com.yangbingdong.spring.autoconfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public final class MyConfigLoader {

    public static Properties loadConfig(String path) {
        Properties properties = new Properties();
        try (InputStream sin = MyConfigLoader.class.getResourceAsStream(path)) {
            properties.load(sin);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
