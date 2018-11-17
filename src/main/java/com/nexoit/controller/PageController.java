package com.nexoit.controller;

import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {


    @Autowired
    private UserService userService;

    //默认设置跳转首页
    @RequestMapping("/")
    public String showIndex() throws Exception {
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    //@RequestMapping("/home")
    public  String showHome(Model model) {
        model.addAttribute("user","SpringSSMtest");
        return "success";
    }


    //请求什么页面，就跳转什么页面
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
