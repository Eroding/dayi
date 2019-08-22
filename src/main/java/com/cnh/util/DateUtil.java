package com.cnh.util;


import com.cnh.enums.RandomEnum;
import com.cnh.exception.DateException;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;


/**
 * 时间比较器
 */
@Slf4j
public class DateUtil {

    public static boolean  dateuse(String validDate, Date date){


        //log.info("在工具类的时间date为，{}",date);
        String[] splitDate = validDate.split("/");

        SimpleDateFormat datea = new SimpleDateFormat("yyyy-MM-dd");


       // String datenow = datea.format(date);

        //System.out.println("现在的date="+datenow);

        /**
         * 将格式里的String 类型转换为Date
         */
        List<Date> DateList = new ArrayList<>();
       for(String datespilt:splitDate){
    Date dates = null;
            try {
                dates = datea.parse(datespilt);
                DateList.add(dates);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        Date dates = DateList.get(0);
        Date dates2 = DateList.get(DateList.size()-1);
        //当前日期比兑奖日期上的最小那个还要小
        if(date.compareTo(dates)==-1){
            throw new DateException(RandomEnum.RANDOM_UNSTART);
        }
        //当前日期比兑奖日期上的最大那个还要大
        if(date.compareTo(dates2)==1){
            throw new DateException(RandomEnum.RANDOM_BIG);
        }

       for(int i=0;i<DateList.size();i++){
                if(DateList.get(i).compareTo(date)==1 ){

                    if(i%2==1){
                        return true;
                    } else
                        throw new DateException(RandomEnum.RANDOM_UNNOWTIME);
                }
        }
        return true;
    }

    public static void main(String[] args) {
        dateuse("2018-9-5/2019-8-7/2019-8-25/2020-5-23",new Date());


    }

}
