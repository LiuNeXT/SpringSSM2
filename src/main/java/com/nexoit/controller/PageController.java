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

    /**
     * Upload form string.
     * 上传界面
     * @return the string
     */
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String uploadForm() {
        return "uploadForm";
    }
}
