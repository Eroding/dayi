package com.cnh.enums;

import lombok.Getter;

/**
 * 兑换码会出现的问题，以20001 开始计数
 */
@Getter
public enum RandomEnum {

    RANDOM_UNUSE(20001,"兑换码无效。如有疑问请联系客服"),

    RANDOM_UNNOWTIME(20002,"兑换码今日不能兑换，可以查看卡片上的兑奖日期"),

    RANDOM_BIG(20007,"超出最大兑换时间范围"),

    RANDOM_USED(20003,"兑换码已被兑换，不能重复兑换，请检查"),

    RANDOM_UNSTART(2004,"兑换活动还未开始，查看卡片上的兑奖日期"),

    RANDOM_ERROR(20005,"兑换码随机生成发生错误"),

    RANDOM_UPDATE(20006,"兑换码更新状态失败")


    ;
    private int code;

    private String message;


    RandomEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
