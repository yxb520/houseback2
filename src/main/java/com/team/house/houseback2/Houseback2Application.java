package com.team.house.houseback2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.team.house.houseback2.mapper")
public class Houseback2Application {

    public static void main(String[] args) {
        SpringApplication.run(Houseback2Application.class, args);
    }

}
