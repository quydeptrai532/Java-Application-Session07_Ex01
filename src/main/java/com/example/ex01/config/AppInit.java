package com.example.ex01.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // Có thể dùng cho cấu hình Security hoặc Service tầng dưới
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // Trỏ đến file cấu hình Spring MVC bên dưới
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        // Đón nhận tất cả các request gửi đến
        return new String[] { "/" };
    }
}