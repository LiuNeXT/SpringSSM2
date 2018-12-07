package com.nexoit.exception;

import com.nexoit.Enum.File;

public class Exception extends RuntimeException{


    private String message;

    public Exception(File file) {
        this.message = file.getMessage();


        //super(file.getCode());
        //this.message = file.getMessage();
    }


}
