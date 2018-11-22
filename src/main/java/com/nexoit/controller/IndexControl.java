package com.nexoit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControl {

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("user","Alex");
        return "index";
      }
}


