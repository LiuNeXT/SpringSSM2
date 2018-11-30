package com.nexoit.controller;


import com.nexoit.pojo.Classroom;
import com.nexoit.pojo.School;
import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import com.sun.tools.javac.code.Attribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuserlist", method = RequestMethod.GET)
    @ResponseBody  //返回Json格式
    public List<User> getUserList() throws Exception {
        List<User> userList = userService.getUserList();
        return userList;

    }

    @RequestMapping(value = "/checkUsername", method = RequestMethod.POST)
    @ResponseBody
    public String checkUserName(String username) throws Exception {
        User user = userService.findUserByName(username);
        return user.getUsername();
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public School test() throws Exception {
        List<User> userList = userService.getUserList();
        Classroom classInfo = new Classroom();
        School school = new School();
        classInfo.setClassId(2);
        classInfo.setClassRoomName("语文");
        classInfo.setStudent(userList);
        school.setSid(1);
        school.setSname("新塘中学");
        school.setSclassrooms(Arrays.asList(classInfo));

        return school;
    }
}

