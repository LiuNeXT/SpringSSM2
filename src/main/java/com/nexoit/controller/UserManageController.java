package com.nexoit.controller;

import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserManageController {

    @Autowired
    private UserService userService;


    //根据用户id查找用户，返回json格式
    @RequestMapping("/findUser_{uid}")
    @ResponseBody
    public User getUserById(@PathVariable Integer uid) throws Exception {
        User user = userService.findUserById(uid);
        return user;
    }

    //用户注册
    @RequestMapping("/user/register")
    public String register(User user) throws Exception {
        userService.addUser(user);
        return "success";
    }

    //用户登录
    @RequestMapping("/user/login")
    public String login(User user, Model model) throws Exception {
        User u = userService.findUserByUsernameAndPassword(user);
        if (u != null) {
            String username = u.getUsername();
            model.addAttribute("user", username);
            return "success";
        } else {
            String error = "用户名或者密码错误";
            model.addAttribute("user", error);
            return "login";
        }
    }


}
