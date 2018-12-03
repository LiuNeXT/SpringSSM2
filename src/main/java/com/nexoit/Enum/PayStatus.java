package com.nexoit.Enum;


import lombok.Getter;

@Getter
public enum PayStatus {


    INIT(0,"默认没支付"),
    SUCCESS(1,"支付成功");


    private Integer code;

    private String message;

    PayStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
