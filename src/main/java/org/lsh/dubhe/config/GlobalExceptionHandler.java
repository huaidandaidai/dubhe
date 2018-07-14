package org.lsh.dubhe.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * @Title: 全局配置类
 * @Description: 全局异常处理
 * @Author: lsh
 * @CreateDate: 2018/7/7 16:53
 * @Version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req,Exception e){
        e.printStackTrace();
        return "500";
    }
//    @Bean
//    public EmbeddeServletContainerCustomizer containerCustomizer(){
//        return (container -> {
//            ErrorPage error404Page=new ErrorPage(HttpStatus.NOT_FOUND,"/404.do");
//            container.addErrorPages(error404Page);
//        });
//    }
}
