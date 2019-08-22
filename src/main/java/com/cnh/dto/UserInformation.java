package com.cnh.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 用户传进来的地址以及这个随机数
 */

@Data
public class UserInformation {

@NotEmpty(message = "用户名不能为空")
    private String username;

    @NotEmpty(message = "手机号不能为空")
    private Long phone;

    @NotEmpty(message = "地址不能为空")
    private String address;


}
