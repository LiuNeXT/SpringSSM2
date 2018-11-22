package com.nexoit.controller;


import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuserlist",method = RequestMethod.GET)
    @ResponseBody  //返回Json格式
    public List<User> getUserList(Model model) throws Exception {
        List<User> userList = userService.getUserList();
        return userList;

    }


    //根据用户id查找用户，返回json格式
/*    @RequestMapping("/findUser_{uid}")
    @ResponseBody
    public User getUserById(@PathVariable Integer uid) throws Exception {
        User user = userService.findUserById(uid);
        return user;
    }*/


}

