package com.cnh.util;


import com.cnh.enums.CodeEnum;

/**
 * 当输入进来的数值和Enum的值相同。把这一行返回去。
 * 某行的.message 可以去到该信息
 */
public class EnumUtil {

    //首先对枚举进行循环
    public static <T extends CodeEnum>T getByCode(Integer code,Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
    }


