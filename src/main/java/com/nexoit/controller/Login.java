package com.nexoit.controller;

import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, Model model) throws Exception{
        User u = userService.findUsernameAndPassword(user);
        if (u != null){
            String a = u.getUsername();
            model.addAttribute("user",a);
            return "success";
        }else {
            String error = "用户名或者密码出错";
            model.addAttribute("error",error);
            return "/login.jsp";
        }
    }
}
