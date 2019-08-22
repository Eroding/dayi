package com.cnh.handler;


import com.cnh.enums.ResultEnum;
import com.cnh.exception.DateException;
import com.cnh.exception.Exceptions;
import com.cnh.result.Result;
import com.cnh.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import  org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@ResponseBody
public class ExceptionHandlers {


    @ExceptionHandler(value = DateException.class)
    @ResponseBody
    public Result handlerDateException(DateException dateException){
        return ResultUtil.error(dateException.getCode(),dateException.getMessage());
    }


  @ExceptionHandler(value = Exceptions.class)
    @ResponseBody
    public Result handlerException(Exceptions Exceptions){

        return ResultUtil.error(ResultEnum.WINDOS_ERROR);
    }

}
