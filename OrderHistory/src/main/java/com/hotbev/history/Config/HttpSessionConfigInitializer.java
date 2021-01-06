package com.hotbev.history.Config;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpSessionConfigInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SecurityConfig.class, HttpSessionConfig.class };
    }
}
