package com.dreamy.zen;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.dreamy.zen.dao")
public class ZenApplication {
  //private  static  Logger logger = Logger.getLogger(ZenApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ZenApplication.class, args);
    }
}
