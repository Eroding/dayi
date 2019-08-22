package com.cnh.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum AddressEnum {

    ADDRESS_ERROR(99,"地址添加失败,请重新选择地址"),

    ADDRESS_UNFIND(100,"输入的地址出现异常，请重新选择"),

    ADDRESS_NOTFOUNDBYONESELF(101,"个人查找地址失败,请输入正确手机号")
;
    private int code;

    private String message;


    AddressEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
