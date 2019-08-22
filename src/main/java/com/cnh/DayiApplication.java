package com.cnh;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "mapping")
@SpringBootApplication(scanBasePackages = {"com.cnh"})
public class DayiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayiApplication.class, args);
    }

}
