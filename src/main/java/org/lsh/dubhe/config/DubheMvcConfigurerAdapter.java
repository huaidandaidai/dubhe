package org.lsh.dubhe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DubheMvcConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DubheInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/static/**")//排除静态资源
                .excludePathPatterns("/login")//排除登录跳转
                .excludePathPatterns("/submitLogin");
    }
}
