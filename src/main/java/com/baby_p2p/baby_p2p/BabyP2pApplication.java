package com.baby_p2p.baby_p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.baby_p2p.baby_p2p.dao")
@SpringBootApplication
public class BabyP2pApplication {

    public static void main(String[] args) {
        SpringApplication.run(BabyP2pApplication.class, args);
    }

}
