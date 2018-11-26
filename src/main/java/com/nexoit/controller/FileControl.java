package com.nexoit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;


/**
 * The type Index control.
 */
@Controller
@RequestMapping("/file")
public class FileControl {


    /**
     * Upload string.
     *
     * @param session     the session
     * @param description the description
     * @param file        the file
     * @return the string
     * @throws Exception the exception
     */
    @RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
    public String upload(HttpSession session,
                         @RequestParam("description") String description,
                         @RequestParam("file") MultipartFile file) throws Exception {


         String filename = file.getOriginalFilename();
         String realPath = session.getServletContext().getRealPath("/images");
         File newfile  = new File(realPath + filename+"alex");
         file.transferTo(newfile);
         return "success";


    }

    /**
     * Upload form string.
     *
     * @return the string
     */
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String uploadForm(){
        return "uploadForm";
    }
}


