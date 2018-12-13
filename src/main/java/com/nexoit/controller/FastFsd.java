package com.nexoit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fastfsd")
public class FastFsd {


   /* @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(String groupId, String path) {
        FastFsdUtils fastFsd = new FastFsdUtils();
        String result = String.valueOf(fastFsd.delete(groupId, path));
        if (result.equals("0")) {
            return "删除成功";
        } else {
            return "删除失败";
        }

    }*/
}
