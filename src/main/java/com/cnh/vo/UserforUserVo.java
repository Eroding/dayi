package com.cnh.vo;

import lombok.Data;

import java.util.Date;


/**
 * 用户自己查看的时候返回的值
 */
@Data
public class UserforUserVo {



    private String username;

    private int phone;

    private String address;

    private String content;

    private Date exchangeDate;



}
