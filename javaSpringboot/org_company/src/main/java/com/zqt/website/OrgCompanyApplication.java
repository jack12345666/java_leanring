package com.zqt.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zqt.website.mapper")
public class OrgCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrgCompanyApplication.class, args);
    }

}
