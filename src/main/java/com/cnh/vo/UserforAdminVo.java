package com.cnh.vo;


import com.cnh.enums.SendGoodsEnum;
import com.cnh.enums.UseEnum;
import com.cnh.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * 管理员查看的时候返回的值
 */
@Data
public class UserforAdminVo {

    private int id;//属于randomCode的兑换码，

    private String random;

    private String username;


    //private int trophy_id;

    private Long phone;

    private String address;


    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date exchangeDate;//兑奖日期

    private int used;//是否使用

    private int sendGoods; //是否发货

    private String content;


    @JsonIgnore
    public SendGoodsEnum getSendStatusEnum(){
        return EnumUtil.getByCode(sendGoods,SendGoodsEnum.class);
    }

    @JsonIgnore
    public UseEnum getUsedStatusEnum(){
        return EnumUtil.getByCode(used,UseEnum.class);
    }


}
