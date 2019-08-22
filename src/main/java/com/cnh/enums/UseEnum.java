package com.cnh.enums;

import lombok.Getter;

@Getter
public enum UseEnum implements CodeEnum{

    USE_STATE_UNUSE(0,"未使用，还没激活"),

    USE_STATE_USED(1,"已使用"),
;
    private int code;

    private String message;


    UseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
