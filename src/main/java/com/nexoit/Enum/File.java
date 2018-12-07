package com.nexoit.Enum;


import lombok.Getter;

@Getter

public enum File {

    FILE_NOT_FIND("400","文件无法在找到","不在线");


    private   String code;

    private  String message;

    private String status;


    File(String code, String message,String status) {
        this.code = code;
        this.message = message;
        this.status =  status;
    }
}
