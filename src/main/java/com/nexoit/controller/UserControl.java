package com.nexoit.controller;


import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuserlist",method = RequestMethod.GET)
    @ResponseBody  //返回Json格式
    public List<User> getUserList() throws Exception {
        List<User> userList = userService.getUserList();
        return userList;

    }

    @RequestMapping(value = "/checkUsername", method = RequestMethod.POST)
    @ResponseBody
    public String checkUserName (String username) throws Exception{
        User user = userService.findUserByName(username);
        return user.getUsername();
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user, Model model)throws Exception{
        userService.addUser(user);
        model.addAttribute("user",user);
        return "success";
    }

}

