package com.cnh.dto;


import lombok.Data;

/**
 * 从controller层传输过来的randomDto
这个默认每次生成1000个，但是循环的话就卸载contorller层
 */

@Data
public class RandomDto {

    private int trophy; //要生成哪种类型的随机数

    private String validDate; //这个是一个日期字符串，把前端传过来的值连城字符串


}
