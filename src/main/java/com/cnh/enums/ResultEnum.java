package com.cnh.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

WINDOS_ERROR(301,"系统异常，请刷新后重试"),
    ;
    private int code;

    private String message;


    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
