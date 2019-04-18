package com.codyy.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;

@Slf4j
public class SysApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(SysApplication.class, args);
            log.info("ocss-icsp-portal-server starting sucessful !!!");
        }catch (Exception e){
            log.error("Unexpected Error Happened when starting !!!");
            System.exit(-1);
        }
    }


}
