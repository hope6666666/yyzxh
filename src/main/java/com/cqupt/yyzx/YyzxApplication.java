package com.cqupt.yyzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.cqupt.yyzx.mapper")
public class YyzxApplication {

    public static void main(String[] args) {
        SpringApplication.run(YyzxApplication.class, args);
    }

}
