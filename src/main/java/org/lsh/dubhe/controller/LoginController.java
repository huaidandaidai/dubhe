package org.lsh.dubhe.controller;

import org.lsh.dubhe.domain.User;
import org.lsh.dubhe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    /**
     * 登录方法
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView view =new ModelAndView("/login");
        return view;
    }
    @RequestMapping("/submitLogin")
    public ModelAndView submitLogin(User loginUser){
        User user=userService.getUserByAccount(loginUser.getUserAccount());
        if(user !=null){
            if(user.getUserPassword().equals(loginUser.getUserPassword())){
                return new ModelAndView("/index");
            }
        }
        return new ModelAndView("/login");
    }
}
