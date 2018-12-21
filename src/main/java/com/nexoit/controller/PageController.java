package com.nexoit.controller;

import com.nexoit.pojo.User;
import com.nexoit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController  用这个注释会返回字符串，不能跳转页面，写接口就用这个
@Controller
public class PageController {

    @Autowired
    private UserService userService;

    //默认返回首页
   /* @RequestMapping("/index")
    public String index(Model model) {
        String name = "Alex";
        String content = "Hello World , Java";
        model.addAttribute("name", name);
        model.addAttribute("content", content);
        return "index";
    }*/


    //返回测试页
    @RequestMapping("/test")
    public String test(Model model) throws Exception {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        return "test";
    }

    //另一种写法,使用ModelAndView
    @RequestMapping("/getusers")
    public ModelAndView modelTest() throws Exception {
        List<User> userList = userService.getUserList();
        ModelAndView mav = new ModelAndView();
        mav.addObject("userList", userList);
        mav.setViewName("index");
        return mav;
    }

    /**
     * Show page string.
     * 写什么界面就跳转到什么界面
     * @param page the page
     * @return the string
    /*  */

   /* @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }*/


}
