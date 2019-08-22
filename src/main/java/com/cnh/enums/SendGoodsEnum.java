package com.cnh.enums;


import lombok.Getter;

@Getter
public enum SendGoodsEnum implements CodeEnum{

    GOODS_UNSEND(0,"未发货"),

    GOODS_SEND(1,"已发货"),

    GOODS_ERROR(2,"发送货物失败")

    ;
    private int code;

    private String message;


    SendGoodsEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
