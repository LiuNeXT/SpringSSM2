package com.nexoit.utils;

import java.io.*;


//InputStream--->Read对象
//OutputStream--->Write对象
public class InOutStream {
    public static void main(String[] args) throws IOException {

        //new文件输入流对象，即是读取文件对象
        FileInputStream fis = new FileInputStream(new File("C://GAKKI.jpg"));

        //定义字节输出流对象
        ByteArrayOutputStream bos = new ByteArrayOutputStream();


        byte[] cache = new byte[8192];

        //输入流一直读取文件对象不等于-1，输出流对象一直写到cache中
        while (fis.read(cache)!= -1){
            bos.write(cache);
        }

    }
}
