package com.jt.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "jdbc2")
@Data
public class JdbcController2 {

    private String name;
    private String jdbcDriver;

    @RequestMapping("/jdbc2")
    public  String jdbcMsg(){
        return name+":"+jdbcDriver;
    }
}
