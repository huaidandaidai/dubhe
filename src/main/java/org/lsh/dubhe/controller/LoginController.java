package org.lsh.dubhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title: LoginController
 * @Description: 登录
 * @Author: lsh
 * @CreateDate: 2018/7/7 16:30
 * @Version: 1.0
 */
@Controller
public class LoginController {
    /**
     * 登录方法
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "";
    }
}
