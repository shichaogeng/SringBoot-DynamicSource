package com.gsc.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.gsc.demo.intercepter.JackInterceptor;
import com.gsc.demo.intercepter.JeffInterceptor;

/**
 * @author shichaogeng
 *
 * 2017年9月19日
 */
@Configuration
public class SpringInterceptorRegister extends WebMvcConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SpringInterceptorRegister.class);
    
    /* 
     * 添加spring中的拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JackInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new JeffInterceptor())
                .addPathPatterns("/freemarker/**");
        super.addInterceptors(registry);
    }
}
