package com.nexoit.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nexoit.pojo.Classroom;
import com.nexoit.pojo.School;
import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
        PageHelper.startPage(1,10);
        List<User> userList = userService.getUserList();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
//        System.out.println(pageInfo.getTotal());
//        System.out.println(pageInfo.getPageSize());
//        System.out.println(pageInfo.getEndRow());
//        System.out.println(pageInfo.getNextPage());
//        System.out.println(pageInfo.getLastPage());

        return userList;

    }

    @RequestMapping(value = "/checkUsername", method = RequestMethod.POST)
    @ResponseBody
    public String checkUserName(String username) throws Exception {
        User user = userService.findUserByName(username);
        return user.getUsername();
    }


    @RequestMapping(value = "/gettitle", method = RequestMethod.GET)
    @ResponseBody
    public School test() throws Exception {
        List<User> userList = userService.getUserList();
        Classroom classInfo = new Classroom();
        School school = new School();
        classInfo.setClassId(2);
        classInfo.setClassRoomName("语文");
 /*       classInfo.setStudent(userList);*/
        school.setSid(1);
        school.setSname("新塘中学");
        school.setSclassrooms(Arrays.asList(classInfo));
        return school;
    }
}

