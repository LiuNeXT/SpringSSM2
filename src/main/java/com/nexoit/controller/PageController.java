package com.nexoit.controller;

import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/view")
public class PageController {


    @Autowired
    private UserService userService;

    //默认设置跳转首页
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    //@RequestMapping(value = "/home", method = RequestMethod.GET)
    @RequestMapping("/home")
    public  String showHome(Model model) {
        model.addAttribute("user","SpringSSMtest");
        return "success";
    }

    @RequestMapping("/login")
    public  String showLogin(Model model) {
        model.addAttribute("user","SpringSSMtest");
        return "success";
    }


/*    //请求什么页面，就跳转什么页面
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }*/

    @RequestMapping("/test")
    public  String test(Model model) throws Exception {
        System.out.println(userService);
        List<User> userList = userService.getUserList();
        System.out.println(userList.size());
        return "success"  ;
    }
}
