package com.cnh.exception;

import com.cnh.dataobject.Address;
import com.cnh.enums.AddressEnum;
import com.cnh.enums.RandomEnum;
import com.cnh.enums.SendGoodsEnum;
import lombok.Data;

@Data
public class DateException extends RuntimeException {
    private Integer code;


    //当传进来的是自己定义的Enum
    public DateException(RandomEnum randomEnum){
        super(randomEnum.getMessage());
        this.code=randomEnum.getCode();
    }

    //当传进来的是未定义的。或者是系统给的异常
    public  DateException(Integer code,String message){
        super(message);
        this.code=code;
    }

    public DateException(AddressEnum addressEnum){
        super(addressEnum.getMessage());
        this.code=addressEnum.getCode();
    }

    public DateException(SendGoodsEnum sendGoodsEnum){
        super(sendGoodsEnum.getMessage());
        this.code=sendGoodsEnum.getCode();
    }




}
