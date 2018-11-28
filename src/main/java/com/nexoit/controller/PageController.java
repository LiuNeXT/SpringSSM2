package com.nexoit.controller;

import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {



    //默认返回首页
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * Show page string.
     * 写什么界面就跳转到什么界面
     * @param page the page
     * @return the string
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

}
