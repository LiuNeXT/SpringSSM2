package com.nexoit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;


/**
 * The type Index control.
 */
@Controller
@RequestMapping("/file")
public class FileControl {


    @RequestMapping("/test")
    public void test() throws IOException {

    }


    /**
     * Upload string.
     * 文件上传功能
     *
     * @param file the file
     * @return the string
     * @throws Exception the exception
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request,
                         MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        File newfile = new File(realPath + filename);

        if (!newfile.exists()) {
            newfile.exists();
        }

        file.transferTo(newfile);
        return "success";

    }




    /**
     * Download.
     * 文件下载功能
     *
     * @param request  the request
     * @param response the response
     * @throws Exception the exception
     */
    @RequestMapping(value = "/down", method = RequestMethod.POST)
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //获取路径文件
        String filename = request.getSession().getServletContext().getRealPath("upload") + "mybatis.txt";
        //获取输入流
        InputStream is = new BufferedInputStream(new FileInputStream(new File(filename)));
        //
        String filename1 = "下载文件.txt";

        filename1 = URLEncoder.encode(filename1, "UTF-8");

        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + filename1);
        response.setContentType("multipart/form-data");

        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());

        int len = 0;
        while ((len = is.read()) != -1) {
            out.write(len);
            out.flush();
        }
        out.close();


    }

}


