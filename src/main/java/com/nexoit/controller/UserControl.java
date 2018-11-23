package com.nexoit.controller;


import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
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



    @RequestMapping(value = "/test")
    public ModelAndView test(HttpServletRequest request, User user)throws Exception{

        ModelAndView view = new ModelAndView();
        userService.addUser(user);
        request.setAttribute("user",user);
        view.setViewName("success");
       // view.addObject("user",user);

        return view;
    }

}

